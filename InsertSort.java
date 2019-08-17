package com.test.entity;

import java.util.Arrays;

public class InsertSort {
	public static void main(String[] args) {
		int[] a={3,2,6,3,7,1,0};
		sort2(a,0,a.length);
		
	}
	static void sort1(int[] arr,int left,int right){
		for (int i = left+1; i < right; i++) {
			int key=arr[i];
			int h=i-1;
			while(h>=0&&key<arr[h]){
				arr[h+1]=arr[h];
				h--;
			}
			arr[h+1]=key;
			
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	
	static void sort2(int[] arr,int a,int b){
		for (int i = 0; i < b; i++) {
			int target=arr[i];
			int count=i-1;
			while(count>=0&&target<arr[count]){
				arr[count+1]=arr[count];
				count--;
			}
			arr[count+1]=target;
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
