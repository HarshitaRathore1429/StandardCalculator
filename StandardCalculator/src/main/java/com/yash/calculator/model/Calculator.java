package com.yash.calculator.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "calculator")
@Table(name = "calculator")
public class Calculator {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String num1;
	private String num2;
	private char operator1;
	private Double result;

	public String getNum1() {
		return num1;
	}

	public void setNum1(String num1) {
		this.num1 = num1;
	}

	public String getNum2() {
		return num2;
	}

	public void setNum2(String num2) {
		this.num2 = num2;
	}

	public char getOperator1() {
		return operator1;
	}

	public void setOperator1(char operator1) {
		this.operator1 = operator1;
	}

	public Double getResult() {
		return result;
	}

	public void setResult(Double result) {
		this.result = result;
	}

	public Calculator(String num1, String num2, char operator1, Double result) {
		super();
		this.num1 = num1;
		this.num2 = num2;
		this.operator1 = operator1;
		this.result = result;
	}

	public Calculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Calculator [num1=" + num1 + ", num2=" + num2 + ", operator=" + operator1 + ", result=" + result + "]";
	}

}
