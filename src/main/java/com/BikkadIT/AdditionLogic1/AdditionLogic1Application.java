package com.BikkadIT.AdditionLogic1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.spi.PackagingDataCalculator;

@SpringBootApplication
public class AdditionLogic1Application {

	public static void main(String[] args) {
		SpringApplication.run(AdditionLogic1Application.class, args);
		
		
	}
	public String getMsgFirst() {
		return "ongoing work";
	}
	public String getMsgThird() {
		return "ongoing work";
	}


}
