package com.test.entity;

import java.math.BigInteger;
import java.util.Scanner;

public class 超大的数比较大小 {
public static void main(String[] args) throws Exception{
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	for (int i = 0; i <n; i++) {
		BigInteger a=sc.nextBigInteger();
		BigInteger b=sc.nextBigInteger();
		BigInteger c=sc.nextBigInteger();
		if(a.add(b).compareTo(c)>0){
// a.compareTo(c)==0------>a==c
//			   a.compareTo(c)>0------->a>c
//			   a.compareTo(c)<0------->a<c
			System.out.println("Case #"+(i+1)+": true");
		}else{
			System.out.println("Case #"+(i+1)+": false");
		}

	}
	
//	
//	int [] arr={1,7,7,8,5,5,4};
//	
//	Map<String, String> map = new LinkedHashMap<String, String>();
//	map.put("张三", "张小三");
//	for (int i = 0; i < arr.length; i++) {
//		map.put(arr[i]+"Eg","MK"+arr[i]);
//	}
//	map.put("铁柱王", "王小柱");
//	
//	for (Map.Entry<String, String> i : map.entrySet()) {
//		System.out.print(i.getKey());
//	}
//	
//	
}
}
