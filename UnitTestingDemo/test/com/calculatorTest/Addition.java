package com.calculatorTest;

import static org.junit.Assert.*;

import org.junit.Test;
import com.calculator.*;

public class Addition {

	@Test
	public void additionTest() 
	{
		
		Calculator cal=new Calculator();
		assertEquals(cal.add(5, 5), 10);
		
	}

}
