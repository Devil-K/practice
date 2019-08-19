package com.test.entity;

import java.util.Scanner;

public class 最大回文串 {
	
	static void test1(String next){
		int count=0;	
		int min=0;
		int max=next.length()-1;
	while(min!=max){
		if(next.charAt(min)==next.charAt(max)){
			min++;
			max--;
			if((max-1)==min){break;}
		}else {
			max--;
			count++;
		}}
	
	int count1=0;
	int min1=0;
	int max1=next.length()-1;
	while(min1!=max1){
		if(next.charAt(min1)==next.charAt(max1)){
			min1++;
			max1--;
			if((max1-1)==min1){break;}
		}else {
			min1++;
			count1++;
		}}
	if(count<count1){
		System.out.println(count);
	}else{
		System.out.println(count1);
	}	
	}
	
	
public static void main(String[] args) {
	test1("google");
	
	Scanner scanner = new Scanner(System.in);	
	while(scanner.hasNext()){
		String next = scanner.next();
		int count=0;	
		int min=0;
		int max=next.length()-1;
	while(min!=max){
		if(next.charAt(min)==next.charAt(max)){
			min++;
			max--;
			if((max-1)==min){break;}
		}else {
			max--;
			count++;
		}}
	
	int count1=0;
	int min1=0;
	int max1=next.length()-1;
	while(min1!=max1){
		if(next.charAt(min1)==next.charAt(max1)){
			min1++;
			max1--;
			if((max1-1)==min1){break;}
		}else {
			min1++;
			count1++;
		}}
	if(count<count1){
		System.out.println(count);
	}else{
		System.out.println(count1);
	}
		
	}
}
}
