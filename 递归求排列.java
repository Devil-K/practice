package com.test.entity;

import java.util.Scanner;

public class 递归求排列 {
	public static void main(String[] args) {
		int [] arr={1,2,3};
		f(arr,0);
		System.out.println();
	}
	
	
	public static int f(int []arr,int n){
		if(n==arr.length){
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i]);
			}
			System.out.println();
		}
		
		for (int i = n; i < arr.length; i++) {
			int a=arr[n];
			arr[n]=arr[i];
			arr[i]=a;
			f(arr,n+1);
			int t=arr[i];
			arr[i]=arr[n];
			arr[n]=t;
		}
		
		return 1;
	}
}

// import java.util.Arrays;
//
// public class Main {
// public static void main(String[] args) {
// int arr[]={1,2,3};
// int ar1[]=new int[3];
// arrange(arr,ar1,0);
//
// }
//
// public static void arrange(int[] arr,int targ[],int n){
// int reslength=3;
// if(n>=reslength){
// System.out.println(Arrays.toString(targ));
// return;
// }
//
// for (int i = 0; i < targ.length; i++) {
// boolean exists=false;
// for (int j = 0; j < targ.length; j++) {
// if(arr[i]==targ[j]){
// exists=true;
// break;
// }
// }
// if(!exists){
// targ[n]=arr[i];
// arrange (arr,targ,n+1);
// }
// }
//
//
// }
// }
