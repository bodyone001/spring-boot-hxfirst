package com.hxfist;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Hello world!
 *
 */
@SpringBootApplication
@EnableScheduling
public class WebSocketApp
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebSocketApp.class,args);
    }
}
