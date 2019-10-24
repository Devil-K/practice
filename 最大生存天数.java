package com.test.entity;

import java.util.Arrays;
import java.util.Scanner;

public class 最大生存天数 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	int x=sc.nextInt();
	int f=sc.nextInt();
	int d=sc.nextInt();
	int p=sc.nextInt();
	int spend=x*f;
	int shenYu=d-spend;
	if(shenYu>0){
		
		int count=0;
		while(shenYu>0){
			shenYu=shenYu-x-p;
			if(shenYu<0){break;}
			count++;
		}
		System.out.println(count+f);
		
	}else{
		int day=d/x;
		System.out.println(day);
	}
	
	
}

	
	
}
