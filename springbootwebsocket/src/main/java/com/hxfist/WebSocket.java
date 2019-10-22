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
public class WebSocket
{
    public static void main( String[] args )
    {
        SpringApplication.run(WebSocket.class,args);
    }
}
