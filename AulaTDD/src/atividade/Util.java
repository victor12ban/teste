package atividade;

import org.apache.jasper.tagplugins.jstl.core.If;

public class Util {

	public static int obterMenor(int i, int j, 
	
		
		int k ) {
			if(i < j && i < k){
				return i;
			}
			if(j < i && j < k){
				
				return j;
			}
			return k ;
		}

	
	

	public static int obterAnoCharssi(String string) {
		
		char res = string.charAt(9);
		if(res== 'B'){
			return 2015;
			
			
		}
		return -1;
		
	} 
	

}

	
	
	

