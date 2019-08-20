package com.test.entity;

import java.util.Scanner;

public class 派对 {
	public static void main(String[] args) {
		test1();//这个思路不对 。。。非常难受。。。。。
		
		//正确思路如下
//		如果max/2=》min+middle  则 直接输出min+middle
//		如果max < (min+middle)*2  则用三个数之和 除以3
	}

	static void test1() {
		Scanner scanner = new Scanner(System.in);
		int group = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < group; i++) {
			int r = scanner.nextInt();
			int g = scanner.nextInt();
			int b = scanner.nextInt();
			
			int min = r;
			int middle = g;
			int max = b;
			
			int one=0;
			int two=0;
			int three=0;
			int four=0;
			if (r > g && (b > g || b > r)) {
				min = g;
				if(b<r){
					middle=b;max=r;
				}else {
					middle=r;max=b;
				}
			}
			if (r > b && (g > b || g > r)) {
				min = b;
				if(g>r){
					middle=r;max=g;
				}else {
					middle=g;max=r;
				}
			}
			one= min;
			
			two=(max-min)/2;//两个同色的  对数
			four=middle-min;
			three=four-two;//中间  单色数
			if(two>four){//3>5
				sum=one+four;
			}else if((max-min)%2==1&&three>=2){
				sum=one+two+1;
			}else {
				sum=one+two;
			}			
			System.out.println(sum);
			sum=0;
		}
		
		
	}

}
