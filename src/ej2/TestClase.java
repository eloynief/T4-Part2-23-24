package ej2;

import java.util.Arrays;

public class TestClase {

	public static void main(String[] args) {
		
		//
		int[] secuencia=new int [55];
		
		//
		int inicio=0,fin=0;
		
		//
		for(int i=0;i<=10;i++) {
			
			//aumentamos el fin para extenderlo a la parte siguiente
			fin+=i;
			
			//
			Arrays.fill(secuencia,inicio,fin,i);
			
			//aumentamos el valor del inicio
			inicio+=i;
		}

		//
		System.out.println(Arrays.toString(secuencia));
		
	}

}

////va añadiendo la "i" hasta que "j" llegue al valor de "i"
//for(int j=0;j<=i;j++) {
//	
//	
//	Arrays.fill(secuencia,inicio,fin,i);
//	
//	aumento++;
//}
//
//inicio+=aumento;
//fin+=aumento;
