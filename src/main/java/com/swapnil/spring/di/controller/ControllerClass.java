package com.swapnil.spring.di.controller;

import org.springframework.stereotype.Controller;

@Controller
public class ControllerClass {
public String hello() {
	System.out.println("HelloWorld");
	return "";
}
}
