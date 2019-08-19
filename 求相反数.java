package com.test.entity;

import java.util.Scanner;
/**
 * 输入100  输出1   输入789  输出987
 *
 */
public class 求相反数 {
	public static void main(String[] args) {
		int aaa=789;
		System.out.println("请输入");
		Scanner scan=new Scanner(System.in);
//		String shuru = scan.next();
//		int int1 = Integer.parseInt(shuru);
		String nextLine = scan.nextLine();
		StringBuffer buffer = new StringBuffer(nextLine);
		StringBuffer reverse = buffer.reverse();
		
//		StringBuilder builder = new StringBuilder(nextLine);
//		StringBuilder builder2 = builder.reverse();
		
		int int1 = Integer.parseInt(reverse.toString());//必须是String类型才提供转换
		System.out.println(int1);
	
		System.out.println(aaa+"----"+int1);
	}

}
