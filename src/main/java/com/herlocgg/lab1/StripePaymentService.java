package com.herlocgg.lab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

//@Service("stripe")
//@Primary
public class StripePaymentService implements PaymentService {
    @Value("$(stripe.apiUrl)")
    private String stripeApiUrl;
    @Value("$(stripe.enabled:true)")
    private boolean enabled;
    @Value("$(stripe.timeout:3000)")
    private int timeout;
    @Value("$(stripe.supported-currencies)")
    private List<String> supportedCurrencies;

    @Override
    public void ProcessPayment(double amount){
        System.out.println("Stripe Payment");
        System.out.println("Amount: " + amount);
        System.out.println("Stripe API URL: " + stripeApiUrl);
        System.out.println("Stripe Enabled: " + enabled);
        System.out.println("Stripe Timeout: " + timeout);
        System.out.println("Stripe Supported currencies: " + supportedCurrencies);

    }
}
