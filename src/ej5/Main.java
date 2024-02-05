package ej5;

import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		//variable tipo random para guardar numeros random
		Random random=new Random();
		
		
		//array para los jugadores de la partida
		int[] jugadores=new int[8];
		

		//variable que guarda un numero random que se va generando
		int numRandom;
		

		int menor;
		
		for (int i=0;i<jugadores.length;i++) {
			
			//generamos el valor automatico
			numRandom=random.nextInt(1000,2800+1);
			
			//le damos el valor del n aleatorio a la posicion de la tabla
			jugadores[i]=numRandom;
			
		}
		

		//ordenamos de mayor a menor
	    for(int i = 0; i < jugadores.length; i++){
	        menor = jugadores[0];

	        if (jugadores[i] < menor){
	            menor = jugadores[i];
	        }
	    }
	    
		System.out.println(Arrays.toString(jugadores));
		
		
	}

}
