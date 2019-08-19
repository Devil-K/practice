package com.test.entity;

/**
 * 把大写字母放到后面，字符的相对位置不变 不能申请额外的空间
 *
 */
public class 字符位移 {
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
		test1("dJJKdsfLL");
		char a = 'A';
		String a1 = "daASfvV";
		char[] cs = a1.toCharArray();
		System.out.println(cs);

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
							System.out.println(cs);
						} else {
							left++;
						}
					}
				}
			}
		}
		System.out.println(cs);

		/*
		 * System.out.println(a); boolean case1 = Character.isLowerCase(a);
		 * System.out.println(case1);
		 */
	}

}
