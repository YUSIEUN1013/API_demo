package com.example.api_demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiDemoApplication {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(ApiDemoApplication.class, args);

        while (true){
            System.out.println("실행 완료");

            Thread.sleep(100000);
        }

    }

}
