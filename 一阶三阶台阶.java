package com.test.entity;

import java.math.BigInteger;

public class 一阶三阶台阶 {
public static void main(String[] args) {
	System.out.println(f(100));
}


public static BigInteger f(int n){
	if(n<=3){
		return new BigInteger(""+n);
	}else {
		
		//int j=1;int k=2;
		//int sum=0;
		BigInteger j = new BigInteger("1");
		BigInteger k = new BigInteger("1");
		BigInteger h = new BigInteger("2");

		BigInteger sum = new BigInteger("0");
		for (int i = 4; i <=n; i++) {
			sum=j.add(h);
			j=k;
			k=h;
			h=sum;
			//2 4382 8195 9672 1629
		}
		
		return sum;
	}
}
}
