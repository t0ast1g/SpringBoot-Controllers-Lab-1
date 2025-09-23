package com.herlocgg.lab1;

import org.springframework.stereotype.Service;

//@Service
public class PaypalPaymentService implements PaymentService {
    @Override
    public void ProcessPayment(double amount){
        System.out.println("Paypal Payment");
        System.out.println("Amount: " + amount);

    }
}
