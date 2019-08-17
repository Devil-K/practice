package com.test.entity;

import java.util.Arrays;

public class BubbleSort {
	public static void main(String[] args) {
		int[] a = { 8, 12, 2, 2, 9, 0 };
		sort1(a);
	}

	static void sort1(int[] arr) {
		for (int j = 0; j < arr.length; j++) {
			for (int i = 1; i < arr.length; i++) {
				while (i < arr.length) {
					if (arr[i - 1] > arr[i]) {
						int sing = arr[i - 1];
						arr[i - 1] = arr[i];
						arr[i] = sing;
						i -= 1;
					}
					i++;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));

	}
}
