package com.example;

import com.example.controller.ConsumerControllerClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestClientException;

import java.io.IOException;

@SpringBootApplication
public class SpringBootHelloWorldApplication {

    public static void main(String[] args) throws RestClientException, IOException {

        SpringApplication.run(SpringBootHelloWorldApplication.class, args);
        /*
        서버 스타스 시 자동으로 호출하는 부분
        ApplicationContext ctx = SpringApplication.run(
                SpringBootHelloWorldApplication.class, args);

        ConsumerControllerClient consumerControllerClient=ctx.getBean(ConsumerControllerClient.class);
        System.out.println(consumerControllerClient);
        consumerControllerClient.getEmployee();
        */
    }

    /*@Bean
    public  ConsumerControllerClient  consumerControllerClient()
    {
        return  new ConsumerControllerClient();
    }
    */
}
