package atividade;

import static org.junit.Assert.*;

import org.junit.Test;

public class TesteCharssi {

	@Test
	public void testCharssi1() {
		int ano = Util.obterAnoCharssi("9BP17164GB0000001");
		assertEquals(2015, ano);
	}
	
	
	
	

}
