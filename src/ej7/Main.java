package ej7;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//
		Scanner sc=new Scanner(System.in);
		
		//
		int[] tablaSeis=new int [6];
		
		//
		int[] tablaGanadora=new int [6];
		
		//
//		int numRandomA=0;
		
		//
		int numAciertos=0;
		
		//recorre los 6 numeros de la tabla
		for(int i=0;i<tablaSeis.length;i++) {
//			
//			numRandom=(int)(Math.random())*49+1;
			
			//
			tablaSeis[i]=(int)(Math.random()*49+1);
			
			//
			tablaGanadora[i]=(int)(Math.random()*49+1);
			
			
			
		}
		
		//
		Arrays.sort(tablaGanadora);
		
		//
		System.out.println(Arrays.toString(tablaSeis));
		
		//
		System.out.println(Arrays.toString(tablaGanadora));
		
		//recorre los 6 numeros de la tabla
		for(int i=0;i<tablaSeis.length;i++) {
			
			
			
			
			//si un numero coincide con uno de la tabla ganadora
			if() {
				numAciertos++;
			}
			
			
		}
		
	}

}
