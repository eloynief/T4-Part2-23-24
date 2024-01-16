package ej2;

import java.util.Arrays;

public class InicioI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//
		int[] secuencia=new int [55];
		
		//
		int inicio=0;
		
		//
		for(int i=0;i<=10;i++) {
			
			
			//
			Arrays.fill(secuencia,inicio,inicio+i,i);
			
			//aumentamos el valor del inicio
			inicio=inicio+i;
		}

		//
		System.out.println(Arrays.toString(secuencia));
		
	}

}
