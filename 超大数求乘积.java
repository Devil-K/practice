package com.test.entity;

import java.math.*;
import java.util.Scanner;

public class 超大数求乘积 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	StringBuilder s1=new StringBuilder(sc.nextLine());
	StringBuilder s2=new StringBuilder();
	int i=0;
	int j=s1.length()-1;
	while(i<=j&&s1.charAt(i)!=' '){
		s2.append(s1.charAt(i));
		i++;
	}
	
	int m=0;
	int n=s1.length()-1;
	while(m<=n){
		s1.replace(0, 1, "");
		if(s1.charAt(0)==' '){
			s1.replace(0, 1, "");
			break;}
		m++;
	}	
//	new BigIntegger;
	BigInteger bi1=new BigInteger(s1+"");
	BigInteger bi2=new BigInteger(s2+"");
	
	bi2=bi1.multiply(bi2);	
	System.out.println(bi2);
	
}
}
