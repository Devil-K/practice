package com.test.entity;

import java.util.Scanner;

/**
 * 把大写字母放到后面，字符的相对位置不变 不能申请额外的空间
 *
 */
public class 字符位移 {
	
	static void test3(String m1){
		double a=99;
		System.out.println(a+"_____--");
		System.out.println(m1);
		String st1 = m1.replaceAll("[A-Z]", "")+m1.replaceAll("[a-z]", "");
		System.out.println(st1);
	}
	
	static String test2(StringBuilder m1){
		System.out.println(m1);
		
		
		for (int j =m1.length(); j >=0; j--) {	
		for (int i = 0; i <=j; i++) {
			int n=i;
			int m=i+1;
			if(m>=m1.length()){break;}
			if(m1.charAt(m)>=97&&m1.charAt(m)<123&&m1.charAt(n)>=65&&m1.charAt(n)<91){
				String tem=m1.charAt(m)+"";
				m1.replace(m, m+1, m1.charAt(n)+"");
				m1.replace(n, n+1, tem);
			}
			
		}}
		String ss=new String(m1);
		//System.out.println(ss);
		char[] cs = ss.toCharArray();
		for (int i = 0; i < cs.length; i++) {
			System.out.print(cs[i]);
		}
		return ss;
//		for (int i = 0; i < m1.length(); i++) {
//			System.out.print(m1.charAt(i));
//			
//		}
//		
	}
	static void test1(String str) {
		char[] cs = str.toCharArray();
		for (int j = 0; j < cs.length; j++) {
			for (int i = 0; i < cs.length; i++) {
				if (Character.isUpperCase(cs[i])) {
					int left = i;
					int right = cs.length - 1;
					int count = 0;
					while (left < right) {
						if (Character.isLowerCase(cs[left + 1])) {
							char tar = cs[left];
							cs[left] = cs[left + 1];
							cs[left + 1] = tar;
							left++;
							// System.out.println(cs);
						} else {
							left++;
						}
					}
				}
			}
		}
		System.out.println(cs);
	}

	
	
	
	public static void main(String[] args) {
		//test1("dJJKdsfLL");
		test3("dJJKdsfLL");
		
//		Scanner sc = new Scanner(System.in);		
//		StringBuilder m1=new StringBuilder(sc.nextLine());//nYUIaB
		//test2(m1);
//		m1.toString();
		char a = 'A';
		String a1 = "daASfvV";
		char[] cs = a1.toCharArray();
		//System.out.println(cs);

		for (int j = 0; j < cs.length; j++) {

			for (int i = 0; i < cs.length; i++) {
				if (Character.isUpperCase(cs[i])) {
					int left = i;
					int right = cs.length - 1;
					int count = 0;
					while (left < right) {
						if (Character.isLowerCase(cs[left + 1])) {
							char tar = cs[left];
							cs[left] = cs[left + 1];
							cs[left + 1] = tar;
							left++;
							//System.out.println(cs);
						} else {
							left++;
						}
					}
				}
			}
		}
		//System.out.println(cs);

		/*
		 * System.out.println(a); boolean case1 = Character.isLowerCase(a);
		 * System.out.println(case1);
		 */
	}

}
