package com.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class Subtraction {

	@Test
	public void substractionTest()
	{
		Calculator cal=new Calculator();
		assertEquals(cal.sub(30, 20), 10);
	}

}
