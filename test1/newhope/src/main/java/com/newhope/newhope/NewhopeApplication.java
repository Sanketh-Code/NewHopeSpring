package com.newhope.newhope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.newhope")
public class NewhopeApplication {

	public static void main(String[] args) {
		SpringApplication.run(NewhopeApplication.class, args);
	}

}
