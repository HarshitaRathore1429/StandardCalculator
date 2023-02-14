package com.yash.calculator.service;

import javax.script.ScriptException;


public interface CalculatorService {
	String getResult(String calc) throws ScriptException;
}
