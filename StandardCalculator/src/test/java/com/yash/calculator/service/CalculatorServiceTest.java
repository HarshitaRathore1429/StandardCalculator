package com.yash.calculator.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class CalculatorServiceTest {
	
	@Autowired
	private CalculatorService calculatorService;
	
	@Test
	public void testAddPass()
	{
		assertEquals("100.0", calculatorService.add("50", "50"));
	}
	
	@Test
	public void testAddFail() {
		assertNotEquals("10", calculatorService.add("100", "80"));
	}
	@Test
	public void testSubtractPass()
	{
		assertEquals("80.0",calculatorService.substract("100", "20"));
	}
	
	@Test
	public void testSubtractFail()
	{
		assertNotEquals("15",calculatorService.substract("50", "30"));
	}
	@Test
	public void testMultiplyPass() {
		assertEquals("20.0",calculatorService.multiply("10", "2"));
	}
	
	@Test
	public void testMultiplyFail()
	{
		assertNotEquals("10", calculatorService.multiply("3", "3"));
	}
	@Test
	public void testDividePass()
	{
		assertEquals("50.0", calculatorService.divide("100", "2"));
	}
	
	@Test
	public void testDivideFail()
	{
		assertNotEquals("20",calculatorService.divide("60", "2"));
	}
	@Test
	public void testSinPass()
	{
		assertEquals("-0.9589242746631385",calculatorService.sin("5"));
	}
	
	@Test
	public void testSinFail()
	{
		assertNotEquals("0.76776564", calculatorService.sin("5"));
	}
	@Test
	public void testCosPass()
	{
		assertEquals("0.28366218546322625",calculatorService.cos("5"));
	}
	
	@Test
	public void testCosFail()
	{
		assertNotEquals("0.88898",calculatorService.cos("5"));
	}
	@Test
	public void testTanPass()
	{
		assertEquals("-3.380515006246586", calculatorService.tan("5"));
	}
	
	@Test
	public void testTanFail()
	{
		assertNotEquals("-8.4839873", calculatorService.tan("5"));
	}
	@Test
	public void testSquarePass()
	{
		assertEquals("25.0",calculatorService.square("5"));
	}
	
	@Test
	public void testFactorialPass()
	{
		assertEquals("120.0",calculatorService.factorial("5"));
	}
	
	@Test
	public void testPiePass()
	{
		assertEquals("6.283185307179586",calculatorService.pi("2"));
	}
	
	@Test
	public void testPowerPass()
	{
		assertEquals("3125.0",calculatorService.power("5", "5"));
	}
	
	@Test
	public void testModulusPass()
	{
		assertEquals("1.0",calculatorService.modulus("10", "3"));
	}
	
	@Test
	public void testUnderrootPass()
	{
		assertEquals("5.0",calculatorService.underRoot("25"));
	}
	
	@Test
	public void testLog10Pass()
	{
		assertEquals("1.0",calculatorService.log1("10"));
	}

}
