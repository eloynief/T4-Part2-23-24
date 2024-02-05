package ej1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		//creaion de scanner
		Scanner sc=new Scanner(System.in);
		
		//variable que representa el array
		int[] nums;
		
		
		//variable para introducir valores
		int n=0,m=0;
		
		//pedimos que se introduzca el tamaño del array
		System.out.println("Introduce el tamaño del array");
		
		//se introduce el valor de n
		n=sc.nextInt();
		
		//creamos un array con el tamaño escrito
		nums=new int[n];
		
		//recorremos el array
		for(int i=0;i<nums.length;i++) {
	
			//pedimos que introduzcamos el valor de m
			System.out.println("Introduce el tamaño de m: ");
			
			//introducimos el valor de m
			m=sc.nextInt();
			
			//le damos el valor de m a la posicion de la tabla
			nums[i]=m;
			
		}
		
		//imprimimos por pantalla los numeros
		System.out.println(Arrays.toString(nums));
		
		
		//cierre de scanner
		sc.close();		
		
	}

}
