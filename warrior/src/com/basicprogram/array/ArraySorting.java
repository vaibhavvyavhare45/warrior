package com.basicprogram.array;


import java.util.Arrays;
public class ArraySorting {
	public static void main(String[] args) {
		
		int a[]=new int[5];//declaring the array
		a[0]=12; //initializing the array
		a[1]=9;
		a[2]=25;
		a[3]=3;
		a[4]=17;
		
		for(int i=0;i<5;i++) {
		System.out.println(a[i]);
		}
		Arrays.sort(a);
		System.out.println("Element an array sorted in accending order:");
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
