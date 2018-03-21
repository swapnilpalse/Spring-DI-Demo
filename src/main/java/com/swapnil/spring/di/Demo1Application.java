package com.swapnil.spring.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.swapnil.spring.di.controller.ControllerClass;

@SpringBootApplication
public class Demo1Application {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(Demo1Application.class, args);
		ControllerClass cc=(ControllerClass) ctx.getBean("controllerClass");
		cc.hello();
	}
}
