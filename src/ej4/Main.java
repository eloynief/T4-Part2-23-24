package ej4;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		
		//variable que guarda los numeros de la tabla para luego ordenarlos
		int[] tabla=new int[30];
		
		//variable que guarda un numero random que se va generando
		int random;
		
		for (int i=0;i<tabla.length;i++) {
			
			//generamos el valor automatico
			random=(int)(Math.random()*10);
			
			//le damos el valor del n aleatorio a la posicion de la tabla
			tabla[i]=random;
			
		}
		
		//ordenamos la tabla
		Arrays.sort(tabla);
		
		
		
	}

}
