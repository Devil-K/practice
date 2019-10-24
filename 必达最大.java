package com.test.entity;
import java.util.Arrays;
import java.util.Scanner;
 
public class 必达最大 {
    public static void main(String[] args) {
 
        test01();
 
    }
 
    static void test01() {
        Scanner scanner = new Scanner(System.in);
        int times = scanner.nextInt();
        /// StringBuilder n1 = new StringBuilder();
 
        int[] arr = new int[times];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
         
        for (int j = arr.length-1; j >=0 ; j--) {
        for (int i = 0; i < j; i++) {       	
            int m=i;
            int n=i+1;
            if(n>=arr.length){break;}   
           
            StringBuilder sb1=new StringBuilder(""+arr[m]);
            StringBuilder sb2=new StringBuilder(""+arr[n]);
            StringBuilder s1=new StringBuilder(""+arr[m]);
            StringBuilder s2=new StringBuilder(""+arr[n]);
            int a,b;
            StringBuilder x1 =sb1.append(sb2);
            StringBuilder x2 = s2.append(s1);
            
//            System.out.println(x1+"-----"+x2);
            int coun=0;
            while(coun<x1.length()){
            	if(x1.charAt(coun)<x2.charAt(coun)){
            		int tem=arr[n];
            		arr[n]=arr[m];
            		arr[m]=tem;
            		break;           		
            	}else if(x1.charAt(coun)==x2.charAt(coun)){
            		coun++;
            	}else {
					break;
				}
            	
            }
//            for (int k = 0; k < x1.length(); k++) {
//            	if(x1.charAt(k)<x2.charAt(k)){
//            		int tem=arr[n];
//            		arr[n]=arr[m];
//            		arr[m]=tem;
//            		break;
//            	}
//				
//			}
//            if(sb1.length()>sb2.length()){
//                 max=sb1.length();min=sb2.length();
//            }else {
//                min=sb1.length();max=sb2.length();
//            }
//            int count=0;
//            for (int k = 0; k < sb2.length(); k++) {
//                if(k>=min){  break;}
//                if(sb1.charAt(k)==sb2.charAt(k)){
//                    count++;
//                }
//                if(sb1.charAt(0)<sb2.charAt(0)){
//                    if(sb1.charAt(1)<sb2.charAt(1)){
//                    int tem=arr[n];
//                    arr[n]=arr[m];
//                    arr[m]=tem;
//                    break;}
//                }else
//                if(count==min){
//                    if(sb2.length()>sb1.length()){
//                        if(sb2.charAt(sb2.length()-1)>sb2.charAt(0)){
//                            int tem=arr[n];
//                            arr[n]=arr[m];
//                            arr[m]=tem;
//                        }
//                    }                  
//                    count=0;
//                }
//                 
//            }
             
             
             
            /*int lth=sb1.length()>sb2.length()?sb1.length():sb2.length();
             
            if(sb1.charAt(0)<sb2.charAt(0)){
                int tem=arr[n];
                arr[n]=arr[m];
                arr[m]=tem;
            }
            if(sb1.charAt(0)==sb2.charAt(0)){
                if(sb2.length()<sb1.length()){
                    int tem=arr[n];
                    arr[n]=arr[m];
                    arr[m]=tem;
                }
            }*/
             
        }}
//System.out.println(Arrays.toString(arr));
for (int i = 0; i < arr.length; i++) {
    if(arr[0]==0){
        System.out.println("0");
        return;
    }else {
        System.out.print(arr[i]);
 
    }
}
    }
}