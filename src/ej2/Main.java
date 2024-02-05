package ej2;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		//creamos el array para guardar los numeros
		int[] secuencia=new int [55];
		
		//variable que representa el punto inicial en el cual el array va introduciendo el numero indicado
		int inicio=0;
		
		//se recorre la tabla
		for(int i=0;i<=10;i++) {
			
			
			//le introducimos el numero indicado en las posiciones a partir del valor del inicio hasta el final(inicio+i)
			Arrays.fill(secuencia,inicio,inicio+i,i);
			
			//aumentamos el valor del inicio
			inicio=inicio+i;
		}

		//imprimimos la tabla(secuencia)
		System.out.println(Arrays.toString(secuencia));
		
	}

}
