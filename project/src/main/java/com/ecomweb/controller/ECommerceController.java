package com.ecomweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ecomweb.entity.EcomWeb;
import com.ecomweb.service.EcomService;

@Controller
@RequestMapping("/Product")
public class ECommerceController {

	@Autowired
	EcomService ec;

	@PostMapping("/create")
	public String createProduct(@RequestBody EcomWeb ew) {

		    ec.createProduct(ew);

		return "Data Saved To Database...!";

	}
	
	@GetMapping("/getall")
	public List<EcomWeb> getAll() {
	
		List<EcomWeb> e = ec.getAll();
		
		return e;
		
		
		
	}
	

}
