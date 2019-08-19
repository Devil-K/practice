package com.test.entity;

import java.util.Scanner;
/**
 * 求一个字符只包含小写字母，求平均长度 保留两位小数
 * 输入aaabbaaac  输出 2.25 
 * 总长度9  四个部分    9/4 =2.25
 *
 */
public class 平均字符块{
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	while(scanner.hasNext()){		
		String next = scanner.next();
		System.out.println(next);
		float count=1;
		for (int i = 0; i < next.length()-1; i++) {
			if(next.charAt(i)!=next.charAt(i+1)){
				count++;
			}
		}
		System.out.println(count+"----"+next.length());
		System.out.println(next.length()/count+"平均长度");
	}
	}

}
