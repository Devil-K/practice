package com.test.entity;

import java.util.Scanner;
/**
 * 1.机器1   2x+1   2.机器2 2x+2  （x可以为0）
 * 硬币只能通过机器产生，设计一个恰好产生n枚硬币的方案。
 * 输入需要的硬币数                  输出使用机器的顺序
 *
 */
public class 魔法硬币 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int int1 = scanner.nextInt();
		StringBuilder builder = new StringBuilder();
		
		while(int1>0){
			if(int1%2==0){
				int1=(int1-2)/2;
				builder.append(2);
			}else {//奇数
				int1=(int1-1)/2;
				builder.append(1);
				
			}
		}
		System.out.println(builder.reverse());
	}

}
