package com.test.entity;

import java.util.ArrayList;
import java.util.Arrays;

public class 值传递{
	static int m=9;
	byte t=-12;
	 static int arr[]={1,2,3,4,5};
	 static StringBuilder a=new StringBuilder("ABC");
	 public static void main(String[] args) {
		 int j=888;
		 f(j);
		 System.out.println(j+"==-");
		man(arr);
		ma(a);
		System.out.println(Arrays.toString(arr));
		System.out.println(a.toString());
		
	}
	 public static void ma(StringBuilder a1){
		 a1.append("QQ");
	 }
	 
	 public static void f(int m){
		 m=999;
	 }
	 public static  void man(int[] arr1){
		 arr1[0]=9;
	 }
  }
