package com.yash.calculator.service;


import javax.script.ScriptException;

import org.graalvm.polyglot.Context;
import org.graalvm.polyglot.Value;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {

	@Override
	public String getResult(String name) throws ScriptException {
			
		Context context=Context.create();
		Value result=context.eval("js",name);
		System.out.println(result.toString());
		return result.toString();
	}

}
