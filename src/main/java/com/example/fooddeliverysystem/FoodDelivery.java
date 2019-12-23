package com.example.fooddeliverysystem;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/view")
public class FoodDelivery {

	@GetMapping("")
	public String welcome()
	{
		return "Welcome to Food Delivery System";
	}
}
