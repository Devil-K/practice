package com.test.entity;

import java.util.Arrays;
import java.util.Scanner;

public class 数组分块翻转 {
public static void main(String[] args) {
	test1();
	
}
static void test1(){
	Scanner scanner = new Scanner(System.in);
	int Sum = scanner.nextInt();
	int rl = scanner.nextInt();
	int car=0;
	if(Sum%rl!=0){
		car=Sum/rl+1;
	}else {
		car=Sum/rl;
	}
	int[] arr=new int[Sum];
	int[] helper=new int[Sum];
	
	for (int i = 0; i < arr.length; i++) {
		arr[i]=scanner.nextInt();
		
	}System.out.println(Arrays.toString(arr));
	
	int len=helper.length-1;
	
		int i=0;
		while(i<arr.length){
			
		
		int t1=i+rl;
		int h1=arr.length-1;
		while(t1>i){
			if(t1>arr.length){	
				t1=arr.length;
				helper[len]=arr[t1-1];
				t1--;
				len--;
			}else {
				helper[len]=arr[t1-1];
				len--;
				t1--;
			}
			
		}
		i+=rl;
		}
		//System.out.println(Arrays.toString(helper));
	//System.out.println(car+""+Arrays.toString(arr));
for (int j = 0; j < helper.length; j++) {
	int a=helper[j];
	System.out.print(a+" ");
}
	
	
}
}
