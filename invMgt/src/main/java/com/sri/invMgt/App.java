package com.sri.invMgt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.sri.invMgt")
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        SpringApplication.run(App.class,  args);
    	System.out.println( "Successfully Launched invMgt! ---------------------------------" );
    }
}
