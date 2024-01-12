package ej2;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final String MESES[]= {
				"Enero","Febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septiembre","Octubre","Noviembre","Diciembre"
				};
		
		Scanner sc=new Scanner(System.in);
		
		
		
		int[] ano=new int[MESES.length];
		
		//variable para introducir valores
		int aumento=0;
		
		
		//
		
		
		for(int i=0;i<ano.length;i++) {
			aumento+=i;
			
			//
			Arrays.fill(ano, i+1);
			
			//
			while(aumento+1>0) {
				System.out.println(i+1);
				aumento--;
			}
			
		}
		
		//
		
		
	}

}
