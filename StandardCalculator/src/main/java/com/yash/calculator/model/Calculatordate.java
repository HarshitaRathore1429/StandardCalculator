package com.yash.calculator.model;

public class Calculatordate {

	private String year1;
	private String year2;
	private String month1;
	private String month2;
	private String fdate;
	private String sdate;
	public String getYear1() {
		return year1;
	}
	public void setYear1(String year1) {
		this.year1 = year1;
	}
	public String getYear2() {
		return year2;
	}
	public void setYear2(String year2) {
		this.year2 = year2;
	}
	public String getMonth1() {
		return month1;
	}
	public void setMonth1(String month1) {
		this.month1 = month1;
	}
	public String getMonth2() {
		return month2;
	}
	public void setMonth2(String month2) {
		this.month2 = month2;
	}
	public String getFdate() {
		return fdate;
	}
	public void setFdate1(String fdate) {
		this.fdate = fdate;
	}
	public String getSdate() {
		return sdate;
	}
	public void setSsate(String sdate) {
		this.sdate = sdate;
	}
	public Calculatordate(String year1, String year2, String month1, String month2, String fdate, String sdate) {
		super();
		this.year1 = year1;
		this.year2 = year2;
		this.month1 = month1;
		this.month2 = month2;
		this.fdate = fdate;
		this.sdate = sdate;
	}
	public Calculatordate() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
