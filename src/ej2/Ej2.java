package ej2;

import java.util.Arrays;
import java.util.Scanner;

public class Ej2 {

	public static void main(String[] args) {
		

		Scanner sc=new Scanner(System.in);
		
		int[] secuencia;
		
		//variable para el mes de cada año. esta va a aumentar hasta que llega al ultimo tamaño del array del año
		int veces=0;
		
		//variable para introducir valores
		int aumento=0;
		
		//
		for(int i=0;i<=10;i++) {
			
			veces++;
			while(veces>0) {
				//si el valor de la i es mayor de 0
				if(i>0) {
					//se guarda el valor
					Arrays.fill(secuencia, i);
					System.out.println(i);
				}
				veces--;
			}
			veces+=i;
		}
		
		
		
	}

}
