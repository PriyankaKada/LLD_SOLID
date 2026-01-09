package com.scaler.lld.design_patterns.adapter;

public interface PaymentProvider {
    PaymentStatus verifyStatus(Long id);
    void createPayment(Long id, String name, String email, Long amount );
}
