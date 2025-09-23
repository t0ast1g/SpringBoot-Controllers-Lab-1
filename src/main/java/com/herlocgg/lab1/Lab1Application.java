package com.herlocgg.lab1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class Lab1Application {

    public static void main(String[] args)
    {
        ApplicationContext context = SpringApplication.run(Lab1Application.class, args);
        var OrderService = context.getBean(OrderService.class);
        //var OrderService = new OrderService(new StripePaymentService());
        OrderService.placeOrder();
    }

}
