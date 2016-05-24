package atividade;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteMenor {

	@Test
	public void testObterMenor1() {
	  int menor= Util.obterMenor(2, 6, 8);
	
	assertEquals(2, menor);
	
	}

	@Test
	public void testObterMenor2() {
	  int menor= Util.obterMenor(10, 6, 8);
	
	assertEquals(6, menor);
	
	}
	
	@Test
	public void testObterMenor3() {
	  int menor= Util.obterMenor(-10, -6, 0);
	
	assertEquals(-10, menor);
	
	}
	@Test
	public void testObterMenor4() {
		  int menor= Util.obterMenor(8, -6, 0);
		
		assertEquals(-6, menor);
		
		}
}
