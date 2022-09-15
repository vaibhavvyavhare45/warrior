package com.basicprogram.array;
import java.util.Arrays;
import java.util.Scanner;

public class SecondSortEle {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any number:");
		int n=sc.nextInt();
		int a[]=new int[n];
		System.out.println("----------------------------------------------------");
		for(int i=0;i<n;i++) {
		a[i]=sc.nextInt();
		}
		System.out.println("the show the element of array is:");
		for (int i : a) {
			System.out.println(i);	
		}
		
		System.out.println("----------------------------------------------------");
		
		System.out.println("Enter present element in the array:");
		 n=sc.nextInt();
		int result=Arrays.binarySearch(a, n);
		 //n=a.length;
		if(result<n) {
			System.out.println("the number "+ n +"is available "+result+" position");
		}
		else {
			System.out.println("the number is not available");
		
			
			 
		}
		
		System.out.println("----------------------------------------------------");
		
		
		System.out.println("the sort array element is:");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		System.out.println("----------------------------------------------------");
		System.out.println("Enter the any number: ");
		n=sc.nextInt();
		int result2=Arrays.binarySearch(a, n);
		if (result2>=0) {
			System.out.println("the number"+n +"is "+result2 + "position");
			
		}
		else {
			System.out.println("the number of position is not available");
		}
		
		
		}
		
		
		
		}
		
		
		
		
		
	
		
		




