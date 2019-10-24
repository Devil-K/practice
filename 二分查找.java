package com.test.entity;

public class 二分查找 {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,8};
		int i = check(arr,8);
		System.out.println(i+"值为"+arr[i]);
		
	}
	
	
	public static int check(int[] arr,int x){
		
		int min=0;
		int max=arr.length;
		
		for (int i = 0; i < arr.length; i++) {
			int mid=(min+max)/2;
			if(x==arr[mid]){
				return mid;
			}
			if(arr[mid]>x){
				max=mid;
			}
			if(arr[mid]<x){
				min=mid;
			}
			
		}
		
		
		return 0;
	}

}
