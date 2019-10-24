package com.test.entity;

import java.util.Scanner;

public class Y队列 {
public static void main(String[] args) {
test1();	
}

private static void test1() {
	Scanner scanner = new Scanner(System.in);
	int people = scanner.nextInt();
	//int length = people1.length();
	//String[] arr = new String[people];
	String x1=scanner.next();
	char[] arr = x1.toCharArray();
	//int people = scanner.nextInt();
	//int people=arr.length;
	if((people-1)%3!=0){
		System.out.println("输入不合法 请输入3K+1的数");	
		return;
	}
//	for (int i = 0; i < arr.length; i++) {
//		arr[i]=scanner.next();
//	}

	int k=(people-1)/3;
	int row=2*k+1;
	int z=0;
	int m=row;
	int al=arr.length-1;
	for (int i = 0; i < k+1; i++) {
		for (int j = 0; j < i; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j < row-(2*i); j++) {
			if(j==row-(2*i)-1||j==0){
				if(j==0){
					char x=arr[z];
					z++;
					System.out.print(x);
				}else{
					char x=arr[z];
				z++;
					System.out.print(x);
				}
				if(z>al){
					break;
				}
				
			}else {
				System.out.print(" ");
			}		
		}		
		System.out.println();
	}
	for (int i = 0; i < k; i++) {
		for (int j = 0; j < k; j++) {
			System.out.print(" ");
		}
		for (int j = 0; j <1; j++) {
			char x=arr[z];
			z++;
				System.out.print(x);
			if(z>al){
				break;
			}
		}
		System.out.println();
	}
	
}

}
