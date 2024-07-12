package com.ImageProcessing.Command;

import com.ImageProcessing.Adapter.payment.PaymentAdapter;

public class PaymentCommand implements Command{
    public PaymentCommand(PaymentAdapter paymentAdapter) {
        this.paymentAdapter = paymentAdapter;
    }
    private PaymentAdapter paymentAdapter;
    @Override
    public void execute() {
        paymentAdapter.integratePaymentGateway(500);
    }
}
