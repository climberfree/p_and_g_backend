package com.pandg;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class App {
    public static void main( String[] args )
    {

        System.out.println( "Starting application...!" );
        SpringApplication.run(App.class, args);
        System.out.println( "The application has started!" );

    }
}
