package com.test.entity;

import java.util.Scanner;

public class 沫璃画画 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// String line = scanner.nextLine();
		int group = scanner.nextInt();
		int row = scanner.nextInt();
		int sum = 0;
		for (int i = 0; i < group; i++) {
			for (int j = 0; j < row; j++) {
				int x1 = scanner.nextInt();
				int y1 = scanner.nextInt();
				int x2 = scanner.nextInt();
				int y2 = scanner.nextInt();
				sum += (y2 - y1 + 1) * (x2 - x1 + 1);
			}

			System.out.println(sum);
			sum = 0;
		}
	}
}
