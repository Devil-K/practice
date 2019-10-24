package com.test.entity;

import java.util.Arrays;

public class 数组奇偶分离 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6 };
		f(arr);
		System.out.println(Arrays.toString(arr));
	}

	public static void f(int[] arr) {
		int b = arr.length;
		// int a=0;
		for (int j = 0; j < b; j++) {

			for (int i = 0; i < b; i++) {
				// int j=arr[i];
				int k = i + 1;
				if (k >= b) {
					break;
				}
				if (arr[i] % 2 == 0 && arr[k] % 2 != 0) {
					int m = arr[i];
					arr[i] = arr[k];
					arr[k] = m;
				}
			}
		}
	}
}
