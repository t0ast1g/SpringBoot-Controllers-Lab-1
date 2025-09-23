package com.herlocgg.lab1;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Value("${payment-gateway}")
    private String paymentGateway;

    @Bean
    public PaymentService stripe(){
        return new StripePaymentService();
    }
    @Bean
    public PaymentService paypal(){
        return new PaypalPaymentService();
    }
    @Bean
    public OrderService orderService(){
        if(paymentGateway.equals("paypal")){
            return new OrderService(paypal());
        }
        if(paymentGateway.equals("stripe")) {
            return new OrderService(paypal());
        }
        throw new RuntimeException("Unknown payment gateway:" + paymentGateway);
    }
}


