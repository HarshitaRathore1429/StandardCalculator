package com.yash.calculator.service;

import java.util.List;

import com.yash.calculator.model.Calculator;
import com.yash.calculator.model.Calculatordate;
import com.yash.calculator.model.Memory;

public interface CalculatorService {
	public String add(String num1, String num2);
	public String substract(String num1, String num2);
	public String multiply(String num1,String num2);
	public String divide(String num1, String num2);
	public String square(String num1);
	public String underRoot(String num1);
	public String modulus(String num1,String num2);
	public String log1(String num1);
	public String sin(String num1);
	public String tan(String num1);
	public String cos(String num1);
	public String factorial(String num1);
	public String power(String num1, String num2);
	public String pi(String num1);
	public String log(String num1);
	public void mS(Memory memory);
	public String mR();
	public String mC();
	public String mPlus(Memory memory);
	public String mSub(Memory memory);
	public String datedifference(Calculatordate calcdate);
}
