package com.scaler.lld.design_pattern.adapter;

import com.scaler.lld.design_patterns.adapter.PayUAdapter;
import com.scaler.lld.design_patterns.adapter.PaymentProvider;
import com.scaler.lld.design_patterns.adapter.PaymentStatus;
import com.scaler.lld.design_patterns.adapter.RazorPayAdapter;
import org.junit.jupiter.api.Test;

public class PaymentProviderTest {

    @Test
    public void testPayment(){
        PaymentProvider razorPay = new RazorPayAdapter();
        razorPay.createPayment(10L,"Priyanka","abc",1000L);

        PaymentProvider payu = new PayUAdapter();
        payu.createPayment(10L,"Priyanka","abc",1000L);


    }

    @Test
    public void testPaymentStatus(){
        PaymentProvider razorPay = new RazorPayAdapter();
        PaymentStatus paymentStatus=razorPay.verifyStatus(1000L);

        assert (PaymentStatus.DONE==paymentStatus);

        PaymentProvider payu = new PayUAdapter();
        PaymentStatus pu= payu.verifyStatus(1000L);
        assert (PaymentStatus.DONE==pu);


    }
}
