package com.yash.calculator.service;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import com.yash.calculator.model.Calculatordate;
import com.yash.calculator.model.Memory;
import com.yash.calculator.repository.CalculatorRepository;

@Service
public class CalculatorServiceImpl implements CalculatorService {
	double result;
	double mem;

	private double factorial(double y) {
		double fact = 1;
		if (y == 0 || y == 1) {
			fact = 1;
		} else {
			for (int i = 2; i <= y; i++) {
				fact *= i;
			}
		}
		return fact;
	}

	@Autowired
	private CalculatorRepository calculatorRepository;
	

	@Override 
	@Cacheable("add")
	public String add(String num1, String num2) {
		// TODO Auto-generated method stub
		result = Double.parseDouble(num1) + Double.parseDouble(num2);
		System.out.println(result);
		return String.valueOf(result);
	}
	@Override
	@Cacheable("sub")
	public String substract(String num1, String num2) {
		result = Double.parseDouble(num1) - Double.parseDouble(num2);
		System.out.println("under subtract");
		return String.valueOf(result);
	}

	@Override
	@Cacheable("multiply")
	public String multiply(String num1, String num2) {
		result = Double.parseDouble(num1) * Double.parseDouble(num2);
		return String.valueOf(result);
	}

	@Override
	@Cacheable("divide")
	public String divide(String num1, String num2) {
		result = Double.parseDouble(num1) / Double.parseDouble(num2);
		return String.valueOf(result);
	}

	@Override
	@Cacheable("square")
	public String square(String num1) {
		result = Double.parseDouble(num1) * Double.parseDouble(num1);
		return String.valueOf(result);
	}

	@Override
	@Cacheable("underRoot")
	public String underRoot(String num1) {
		result = Math.sqrt(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("modulus")
	public String modulus(String num1, String num2) {
		result = Double.parseDouble(num1) % Double.parseDouble(num2);
		return String.valueOf(result);
	}

	@Override
	@Cacheable("log1")
	public String log1(String num1) {
		result = Math.log10(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("sin")
	public String sin(String num1) {
		result = Math.sin(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("tan")
	public String tan(String num1) {
		result = Math.tan(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("cos")
	public String cos(String num1) {
		result = Math.cos(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("factorial")
	public String factorial(String num1) {
		result = factorial(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("power")
	public String power(String num1, String num2) {
		result=Math.pow(Double.parseDouble(num1), Double.parseDouble(num2));
		return String.valueOf(result);
	}

	@Override
	@Cacheable("pi")
	public String pi(String num1) {
		result=Double.parseDouble(num1)*Math.PI;
		return String.valueOf(result);
	}

	@Override
	@Cacheable("log")
	public String log(String num1) {
		result=Math.log(Double.parseDouble(num1));
		return String.valueOf(result);
	}

	@Override
	public void mS(Memory memory) {
		System.out.println(memory.getSaved());
		calculatorRepository.deleteAll();
		calculatorRepository.save(memory);
		mem=Double.parseDouble(memory.getSaved());
		//memory.getSaved();	
	}

	
	@Override
	public String mC() {
		// TODO Auto-generated method stub
		System.out.println(mem);
		calculatorRepository.deleteBySaved(String.valueOf(mem));
		mem=0;
		//System.out.print("hi");
		return String.valueOf(mem);
	}

	@Override
	public String mPlus(Memory memory) {
		// TODO Auto-generated method stub
		result=Double.parseDouble(memory.getSaved()) +mem;
		//System.out.println(mem);
		mem=result;
		memory.setSaved(String.valueOf(mem));
		mS(memory);
		return String.valueOf(result);
	}

	@Override
	public String mSub(Memory memory) {
		// TODO Auto-generated method stub
		result=mem-Double.parseDouble(memory.getSaved());
		//System.out.println(result);
		//System.out.println(mem);
		mem=result;
		memory.setSaved(String.valueOf(mem));
		mS(memory);
		return String.valueOf(result);
	}
	@Override
	public String mR() {
		// TODO Auto-generated method stub
		return String.valueOf(mem);
	}
	@Override
	public String datedifference(Calculatordate calcdate) {
		 LocalDate start_date= LocalDate.of(Integer.parseInt(calcdate.getYear1()),Integer.parseInt (calcdate.getMonth1()),Integer.parseInt (calcdate.getFdate()));
         LocalDate end_date= LocalDate.of(Integer.parseInt(calcdate.getYear2()),Integer.parseInt(calcdate.getMonth2()),Integer.parseInt(calcdate.getSdate()));
         long noOfDaysDifference = ChronoUnit.DAYS.between(start_date, end_date); 
 		 //System.out.println(calcdate.getDate1());
 		 return String.valueOf(noOfDaysDifference);
	}
	
}
