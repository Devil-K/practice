package com.test.entity;

import java.util.ArrayList;

public class 单链表创建和遍历 {
	public static ListNode f(ListNode Node,int k){
		
 		ListNode p=null;
		int count=0,len=0;
		p=Node;
		while(p!=null){
			count++;
			p=p.next;
		}
		System.out.println(count);
		while(Node!=null){
			if(count-len==k){
				return Node;
			}else{
				len++;
				Node=Node.next;
			}
		}	
		
		return null;
	}
	
public static void main(String[] args) {
	ListNode Node = new ListNode(1);
	ListNode p=null;
	p=Node;
	p.next=null;
	for (int i = 2; i <=8; i++) {
		ListNode q = new ListNode(i);
		p.next=q;
		p=q;
		p.next=null;
		
	}
	p=f(Node,2);
	System.out.println(p.val);
//	while(Node!=null){
	//遍历链表的方法
//		System.out.println(Node.val);
//		Node=Node.next;
//	}
}
}
class ListNode{
	int val;
	ListNode next=null;
	ListNode(int val){
		this.val=val;
	}
	
	
}