package com.test.entity;

public class 求一个数的次方 {
public static void main(String[] args) {
	f(-2.0,-2);
}

public static void f(double a,int b){
	
	double bas=1;
	if(b>0){
		for (int i = 0; i<b; i++) {
			bas*=a;
		}
		System.out.println(bas);
	}else{
		for(int i=0;i>b;i--){
			bas*=a;
		}
		System.out.println(1/bas);
	}
	
}
}
