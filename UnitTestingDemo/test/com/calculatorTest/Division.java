package com.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class Division {

	@Test
	public void divisionTest() 
	{
		Calculator cal=new Calculator();
		assertEquals(cal.div(20, 4), 5);
	}

}
