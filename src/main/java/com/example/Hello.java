package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@RestController
public class Hello {

	@GetMapping("/msg")
	public String helloworld()
	{
		LocalDate d = LocalDate.now();
		DateTimeFormatter fd = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		
		return "Hello Spring-Boot "+d.format(fd);
	}				
}
