package com.ibm.devworks.examples.java.lll;

import org.junit.Test;
import static org.junit.Assert.*;

public class TestDispatchServlet {
	@Test
	public void TestSum() {
		DispatchServlet chat = new DispatchServlet();
		
		double result = chat.sum(10,50);
		assertEquals(60, result, 0);
	}
}
