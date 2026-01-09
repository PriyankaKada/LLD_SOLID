package com.scaler.lld.design_patterns.externalApi;

public class PayUApi {

    public void pay(Long id,Long amount ){
        System.out.println("PAyu pay ....");
    }
    public PayUStatus checkStatus(Long id){
        return PayUStatus.OK;
    }
}
