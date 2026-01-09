package com.scaler.lld.design_patterns.adapter;

import com.scaler.lld.design_patterns.externalApi.RazorPayApi;
import com.scaler.lld.design_patterns.externalApi.RazorPayEnum;

public class RazorPayAdapter implements PaymentProvider {
    RazorPayApi razorPayApi = new RazorPayApi();

    @Override
    public PaymentStatus verifyStatus(Long id) {
        RazorPayEnum razorPayEnum = razorPayApi.checkStatus(id);
       return toPaymentStatus(razorPayEnum);
    }

    private PaymentStatus toPaymentStatus(RazorPayEnum razorPayEnum) {

        return switch (razorPayEnum) {
            case SUCCESS -> PaymentStatus.DONE;
            case FAILED -> PaymentStatus.NOT_DONE;
        };
    }

    @Override
    public void createPayment(Long id, String name, String email, Long amount) {
        razorPayApi.pay(id,name,email,amount);
    }
}
