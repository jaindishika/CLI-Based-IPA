package com.ImageProcessing.Adapter.payment;

public class GpayAdapter implements PaymentAdapter{
    private Gpay gpay;
    public GpayAdapter(Gpay gpay) {
        this.gpay = gpay;
    }
    @Override
    public void integratePaymentGateway(double amount) {
        System.out.println("Processing payment through GooglePay: " + amount);
    }
}
