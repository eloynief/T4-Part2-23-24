package ej3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		//arrays para guaradar los valores que se van introduciendo
		int[] nums1=new int[10];
		int[] nums2=new int[10];
		//numero que aumenta en base al incremento del array
		int aumento=0;
		
		//variable para introducir valores
		int num=0;
		
		
//		for (int i:nums1) {
//			System.out.println("Introduce 10 valores");
//			
//			//
//			i=sc.nextInt();
//			nums1[aumento]=i;
//			aumento++;
//		}
		
		
		//se recorre 20 veces para introducir el valor. nums1.length+nums2.length=20 ya que ambos tienen 10 de length
		for(int i=0;i<nums1.length+nums2.length;i++) {
			
			System.out.println("Introduce 20 valores");
			
			//
			num=sc.nextInt();
			
			
			//si el tamaño es igual o superior al tamaño del primer array
			if(i<nums1.length) {
				//se introduce el tamaño al primer array
				nums1[aumento]=num;
			}
			//si la i es igual que el tamaño del primer array
			else if(i==nums1.length){
				aumento=0;
				//se introduce el tamaño al segundo array
				nums2[aumento]=num;
			}
			else {
				//se introduce el tamaño al segundo array
				nums2[aumento]=num;
			}
			
			
			aumento++;
			
		}
		
		
		System.out.println(Arrays.toString(nums1));
		System.out.println(Arrays.toString(nums2));
		
//		for(int i=0;i<nums1.length;i++) {
//			
//			//
//			Arrays.fill(nums1, i+1);
//			
//			
//			
//		}
		
		
		
	}

}
