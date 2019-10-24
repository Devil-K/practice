package com.test.entity;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class 最大的子{
	public static void main(String[] args) {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String ar = null;
		try {
			ar=read.readLine();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Scanner sc = new Scanner(System.in);
		//String ar = "AABB";
		char[] arr = ar.toCharArray();
		
		//System.out.println(Arrays.toString(arr));
		System.out.println(max(arr));
		//max(arr);
	}
	
	
	
	
	public static int max(char [] arr){
		
		int count=arr.length;
		//System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if(arr[i]==arr[j]){
					count--;
					break;
				}
			}
			
		}
		if(count>2){
			return 0;
			}else{
				int m=count;
				while(m!=1){
					count=count*(m-1);
					m--;
				}
				return count;
			}
		
		
		
		
		
	}
	
}