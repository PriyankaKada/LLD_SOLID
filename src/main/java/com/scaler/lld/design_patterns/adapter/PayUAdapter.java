package com.scaler.lld.design_patterns.adapter;

import com.scaler.lld.design_patterns.externalApi.PayUApi;
import com.scaler.lld.design_patterns.externalApi.PayUStatus;

public class PayUAdapter implements PaymentProvider {
    PayUApi razorPayApi = new PayUApi();

    @Override
    public PaymentStatus verifyStatus(Long id) {
        PayUStatus razorPayEnum = razorPayApi.checkStatus(id);
       return toPaymentStatus(razorPayEnum);
    }

    private PaymentStatus toPaymentStatus(PayUStatus razorPayEnum) {

        return switch (razorPayEnum) {
            case OK -> PaymentStatus.DONE;
            case  NOT_OK-> PaymentStatus.NOT_DONE;
        };
    }

    @Override
    public void createPayment(Long id, String name, String email, Long amount) {
        razorPayApi.pay(id,amount);
    }
}
