package com.test.entity;

public class 求1的个数 {
public static void main(String[] args) {
	int n=9;
	System.out.println(Integer.toString(n,2)+"====");
   	int count=0;
	while(n!=0){
		count++;
		n=n&(n-1);
		System.out.println(n);
	}
	System.out.println(count+"----");
	
	
	
//	int m=-9;
//	String g = Integer.toString(m, 2);
//	 System.out.println(g);
//	int k=m;
//	int count=0;
//	if(k<0){
//		for(int i=0;i<32;i++){
//			if((k^1)%2==0){
//				count++;
//			}
//			k=k>>1;
//			
//		}
//	}
//	else{
//	while(k!=0){
//		if(k%2==1){count++;}
//		k=k/2;
//	}
//	}
//	System.out.println(count);
}
}
