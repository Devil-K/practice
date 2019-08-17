package com.test.entity;

public class ThreadLocalDemo extends Thread{
	private number n1;
	public ThreadLocalDemo(number n){
		this.n1=n;
	}
@Override
public void run() {
	System.out.println(getName()+"---"+n1.getNum());
}
public static void main(String[] args) {
	number n=new number(0);
	ThreadLocalDemo t1=new ThreadLocalDemo(n);
	ThreadLocalDemo t2=new ThreadLocalDemo(n);
	ThreadLocalDemo t3=new ThreadLocalDemo(n);
	t1.start();
	t2.start();
	t3.start();
}
	
}
class number{
	private int num;
	public number(int num){
		this.num=num;	
	}
	
	public int getNum(){
		int count=++num;
		return count;
	}
}