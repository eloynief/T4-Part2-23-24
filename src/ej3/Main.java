package ej3;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		
		int[] nums1=new int[10];
		int[] nums2=new int[10];
		int aumento=0;
		
		//variable para introducir valores
		int num=0;
		
		
		for (int i:nums1) {
			System.out.println("Introduce 10 valores");
			
			//
			i=sc.nextInt();
			nums1[aumento]=i;
			aumento++;
		}

		System.out.println(Arrays.toString(nums1));
		
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
