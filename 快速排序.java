package com.test.entity;

import java.util.Arrays;

public class 快速排序 {

	public static void main(String[] args) {
		int[] arr = { 23, 46, 0, 8, 11, 18 };
		int i = getPartition(arr, 0, arr.length - 1);
		System.out.println(i);
		System.out.println(Arrays.toString(arr));
	}

	static void qsort() {

	}

	static int getPartition(int[] arr, int low, int hig) {
		int l = low;
		int r = hig;
		int tar = arr[low];
		if (l >= r) {
			return 0;
		}
		while (r > l) {
			while (r > l && arr[r] > tar) {
				r--;
			}
			arr[l] = arr[r];

			while (r > l && arr[l] < tar) {
				l++;
			}
			arr[r] = arr[l];
		}
		arr[l] = tar;
		getPartition(arr, low, l - 1);
		getPartition(arr, l + 1, hig);
		return l;
	}
}
