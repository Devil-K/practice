package com.test.entity;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println(f(sc.nextInt()));
	String a=sc.next();
	a.toCharArray();
	System.out.println(f(2));
}

public static int f(int a){
	if(a<2){
		return a;
	}
	int th=0;
	int tw=0;
	int sum=1;
	int j=a;
	while(j>4){
		th++;
		j=j-3;
	}
	if(j==3){
		th++;
	}
	else{
	while(j>=2){
		tw++;
		j=j-2;
	}}
	
	while(th!=0){
		sum=sum*3;
		th--;
	}
	while(tw!=0){
		sum=sum*2;
		tw--;
	}
	return sum;
}
}
