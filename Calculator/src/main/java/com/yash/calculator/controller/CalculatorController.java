package com.yash.calculator.controller;

import javax.script.ScriptException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.yash.calculator.service.CalculatorService;

@RestController
@CrossOrigin
public class CalculatorController {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@PostMapping("/calculate")
	public String doCalculate(@RequestBody String result) throws ScriptException
	{
		 System.out.println(result);
		
		return calculatorService.getResult(result);
	}

}
