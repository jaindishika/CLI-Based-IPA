package com.ImageProcessing.Adapter.payment;

public class PaytmAdapter implements PaymentAdapter {
    private Paytm paytm;

    public PaytmAdapter(Paytm paytm) {
        this.paytm = paytm;
    }

    @Override
    public void integratePaymentGateway(double amount) {
        paytm.makePayment(amount);
    }
}
