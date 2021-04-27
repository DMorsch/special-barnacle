package pucrs.qp.triangle;

import static org.junit.Assert.*;

import java.text.ParseException;

import org.junit.Test;

public class P1015Test {
	
	@Test
	public void testURI1() throws ParseException {
		//primeira sample
		double x1 = 1.0, y1 = 7.0, x2 = 5.0, y2 = 9.0;
		assertEquals(4.4721, App.distancia(x1,y1,x2,y2), 0.0);
	}
	
	@Test
	public void testURI2() throws ParseException {
		//segunda sample
		double x1 = -2.5, y1 = 0.4, x2 = 12.1, y2 = 7.3;
		assertEquals(16.1484, App.distancia(x1,y1,x2,y2), 0.0);
	}
	
	@Test
	public void testURI3() throws ParseException {
		//terceira sample
		double x1 = 2.5, y1 = -0.4, x2 = -12.2, y2 = 7.0;
		assertEquals(16.4575, App.distancia(x1,y1,x2,y2), 0.0);
	}

}
