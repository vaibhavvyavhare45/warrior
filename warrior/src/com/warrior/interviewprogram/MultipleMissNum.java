package com.warrior.interviewprogram;

public class MultipleMissNum {
	public static void main(String[] args) {
		int a[] = { 1, 3, 4, 5, 8, 6, 10 };

		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		int max = a[a.length - 1];
		System.out.println(max);

		System.out.println("the missing number is: ");
		int j = 0;
		for (int i = 1; i <= max; i++) {
			if (j < a.length && i == a[j]) {
				j++;
			} else {
				System.out.println(i + " ");
			}

		}

	}

}
