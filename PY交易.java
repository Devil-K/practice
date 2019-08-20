package com.test.entity;

import java.util.Scanner;

public class PY交易 {
public static void main(String[] args) {
	test1();
}

static void test1(){
	Scanner scanner = new Scanner(System.in);
	int group = scanner.nextInt();
	int sum=0;
	for (int i = 0; i <group; i++) {
		int py1 = scanner.nextInt();
		int py2 = scanner.nextInt();
		int py3 = scanner.nextInt();
		int py4 = scanner.nextInt();
		int py5 = scanner.nextInt();
		sum=py1+py2+py3+py4+py5;
		if(sum%5==0){
			System.out.println(sum/5);
		}else {
			System.out.println(-1);
		}
	}
	
	
}
}
