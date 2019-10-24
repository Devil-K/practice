package com.test.entity;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;
import java.math.*;

public class 找最大的三个数字{
public static void main(String []args){
Scanner sc= new Scanner(System.in);
    int dat=sc.nextInt();
    int[] arr=new int[dat];
    for(int i=0;i<dat;i++){
        arr[i]=sc.nextInt();
    }
    
  for(int i=0;i<dat;i++){
    for(int j=1;j<dat;j++){
        if(arr[j-1]>arr[j]){
            int tem=arr[j];
            arr[j]=arr[j-1];
            arr[j-1]=tem;
        }
    }}
   // System.out.println(Arrays.toString(arr));
//     long b1=807120253114l;
//     System.out.println(b1);
//     long m2=9223372036854775807l;
//    StringBuilder m1=new StringBuilder("");
//    
    BigInteger max,a,b;
    int com;
    BigInteger bl0 = new BigInteger(arr[0]+"");
	BigInteger bl1 = new BigInteger(""+arr[1]);
	BigInteger br1 = new BigInteger(""+arr[dat-1]);
	BigInteger br2 = new BigInteger(""+arr[dat-2]);
	BigInteger br3 = new BigInteger(""+arr[dat-3]);

	
   a=br1.multiply(br2).multiply(br3);
   b=bl0.multiply(bl1).multiply(br1);
  com= a.compareTo(b);
   if(com==1){
	   System.out.println(a);
   }else {
	   System.out.println(b);

}
//     a=arr[0]*arr[1]*arr[dat-1];
//     BigInteger temp = new BigInteger(a);
//
//     System.out.println(a+"cao");
//     b=arr[dat-1]*arr[dat-2]*arr[dat-3]+0l;
//    if(a>b){
//        m1.append(a);
//    }else{m1.append(b);}
//System.out.print(a);
}

}