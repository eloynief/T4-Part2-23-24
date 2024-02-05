package ej6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[] tabla=new int[1000];
		
		//variable para introducir valores
		int n=0;
		
		int random;
		
		//int que representa el numero de veces que aparece ese numero en el array
		int veces=0;
		

		//recorremos la tabla
		for(int i=0;i<tabla.length;i++){
			
			//le damos el valor al random
			random=(int)(Math.random()*100);
			
			//le damos el valor del numero random a la posicion indicada
			tabla[i]=random;
			
		}

		//pedimos que se introduzca el tamaño del array
		System.out.println("Introduce el numero que quieres ver cuantas veces aparece");
		
		//se introduce el valor de n
		n=sc.nextInt();
		
		
		//recorremos la tabla otra vez
		for(int i=0;i<tabla.length;i++){
			//si el numero coincide con el numero de la tabla
			if(tabla[i]==n) {
				//aumenta el numero de veces que aparece el numero pedido
				veces++;
			}
			
		}
		
		System.out.println("El numero aparece "+veces+" veces");
		
	}

}
