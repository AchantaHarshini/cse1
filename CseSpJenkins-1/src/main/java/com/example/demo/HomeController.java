package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
@GetMapping("/home")
public String rocks() {
	return "welcome to springbbot with jenkins world+dp";
}
}