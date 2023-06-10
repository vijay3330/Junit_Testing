package com.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.calculator.Calculator;

public class Multiplication {

	@Test
	public void MultiplicationTest()
	{
		Calculator cal=new Calculator();
		assertEquals(cal.mul(10, 10), 100);
	}

}
