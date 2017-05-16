package aravindh.currency.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages="aravindh.currency")
public class CurrencyConvApplication {

	public static void main(String[] args) {
		SpringApplication.run(CurrencyConvApplication.class, args);
	}
}
