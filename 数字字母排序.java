package com.test.entity;

import java.io.*;
import java.util.Arrays;

public class 数字字母排序{
    public static void main(String[] args) throws Exception{
      BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
      char[] arr = bf.readLine().toCharArray();
      Arrays.sort(arr);
//      System.out.println(Arrays.toString(arr));
      StringBuilder sb1 = new StringBuilder();
      StringBuilder sb2=new StringBuilder();
      for (int i = 0; i < arr.length; i++) {
    	  if(arr[i]<='9'){
    		  sb1.append(arr[i]);
    	  }else{
    		  sb2.append(arr[i]);
    	  }
		
	}
      System.out.println(sb2.toString()+sb1.toString());
   }
    
}