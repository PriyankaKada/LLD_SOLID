package com.scaler.lld.design_patterns.externalApi;
// Step 0== > Incompatible External API
public class RazorPayApi {
    public void pay(Long id,String name, String email,Long amount ){
        System.out.println("Razorpay pay ....");
    }
    public RazorPayEnum checkStatus(Long id){
        return RazorPayEnum.SUCCESS;
    }
}
