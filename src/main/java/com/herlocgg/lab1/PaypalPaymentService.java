package com.herlocgg.lab1;

// No @Service because beans are provided via AppConfig

public class PaypalPaymentService implements PaymentService {
    @Override
    public void ProcessPayment(double amount){
        System.out.println("Paypal Payment");
        System.out.println("Amount: " + amount);

    }
}
