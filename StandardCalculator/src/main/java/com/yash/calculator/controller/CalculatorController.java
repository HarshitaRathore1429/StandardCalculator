package com.yash.calculator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.yash.calculator.model.Calculator;
import com.yash.calculator.model.Calculatordate;
import com.yash.calculator.model.Memory;
import com.yash.calculator.service.CalculatorService;

@RestController
@CrossOrigin
@RequestMapping("/calculator")
public class CalculatorController {

	@Autowired
	private CalculatorService calculatorService;
	
	@PostMapping("/add")
	public String add(@RequestBody Calculator calc) {
		System.out.println(calc);
		System.out.println(calc.getNum1().getClass());
		return calculatorService.add(calc.getNum1(), calc.getNum2());	
	}

	@PostMapping("/substract")
	public String substract(@RequestBody Calculator calc) {
		return calculatorService.substract(calc.getNum1(), calc.getNum2());
		
	}
	@PostMapping("/multiply")
	public String multiply(@RequestBody Calculator calc) {
		return calculatorService.multiply(calc.getNum1(), calc.getNum2());
		
	}
	@PostMapping("/divide")
	public String divide(@RequestBody Calculator calc) {
		return calculatorService.divide(calc.getNum1(), calc.getNum2());
		
	}
	@PostMapping("/modulus")
	public String modulus(@RequestBody Calculator calc) {
		return calculatorService.modulus(calc.getNum1(), calc.getNum2());
		
	}
	@PostMapping("/square")
	public String square(@RequestBody Calculator calc) {
		return calculatorService.square(calc.getNum1());
		
	}
	@PostMapping("/underroot")
	public String underRoot(@RequestBody Calculator calc) {
		return calculatorService.underRoot(calc.getNum1());
		
	}
	@PostMapping("/log1")
	public String log1(@RequestBody Calculator calc) {
		return calculatorService.log1(calc.getNum1());		
	}
	@PostMapping("/sin")
	public String sin(@RequestBody Calculator calc) {
		return calculatorService.sin(calc.getNum1 ());		
	}
	@PostMapping("/cos")
	public String cos(@RequestBody Calculator calc) {
		return calculatorService.cos(calc.getNum1());		
	}
	@PostMapping("/tan")
	public String tan(@RequestBody Calculator calc) {
		return calculatorService.tan(calc.getNum1());		
	}
	@PostMapping("/factorial")
	public String factorial(@RequestBody Calculator calc) {
		return calculatorService.factorial(calc.getNum1());		
	}
	@PostMapping("/power")
	public String power(@RequestBody Calculator calc) {
		return calculatorService.power(calc.getNum1(),calc.getNum2());		
	}
	@PostMapping("/pi")
	public String pi(@RequestBody Calculator calc) {
		return calculatorService.pi(calc.getNum1());		
	}
	@PostMapping("/log")
	public String log(@RequestBody Calculator calc) {
		return calculatorService.log(calc.getNum1());
	}
	@PostMapping("/mS")
	public void mS(@RequestBody Memory memory) {
		calculatorService.mS(memory);	
	}
	@GetMapping("/mR")
	public String mR() {
		return calculatorService.mR();
	}
	@DeleteMapping("/mC")
	public String mC() {
		 return calculatorService.mC();
		
	}
	@PostMapping("/m+")
	public String mplus(@RequestBody Memory memory)
	{
		return calculatorService.mPlus(memory);
	}
	@PostMapping("/m-")
	public String msub(@RequestBody Memory memory)
	{
		return calculatorService.mSub( memory);
	}
	@PostMapping("/datedifference")
	public String dateDifference(@RequestBody Calculatordate calcdate)
	{
		return calculatorService.datedifference(calcdate);
	}
}
