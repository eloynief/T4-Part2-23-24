package ej1;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[] nums;
		
		
		//variable para introducir valores
		int n=0,m=0;
		
		System.out.println("Introduce el tamaño del array");
		
		n=sc.nextInt();
		
		nums=new int[n];
		
		//
		for(int i=0;i<nums.length;i++) {
	
			System.out.println("Introduce el tamaño de m: ");
			
			m=sc.nextInt();
			
			nums[i]=m;
			
		}
		
		System.out.println(Arrays.toString(nums));
		
		
		
		
	}

}
