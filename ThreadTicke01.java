package com.test.entity;

public class ThreadTicke01 {
	public static void main(String[] args) {
		ticketThread saleticket = new ticketThread();
		Thread t1 = new Thread(saleticket, "线程1");
		Thread t2 = new Thread(saleticket, "线程2");
		t1.start();
		try {
			Thread.sleep(900);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		t2.start();
	}

}

class ticketThread implements Runnable {
	private Integer ticketCount = 100;
	private Object ob=new Object();
	@Override
	public void run() {
		while (ticketCount > 0) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			sale();
		}
	}
	public  synchronized void sale() {
//		synchronized (this) {
			if(ticketCount>0){
				
				System.out.println(Thread.currentThread().getName() + "这是啥" + (100 - ticketCount + 1) + "Ʊ");
				ticketCount--;
//			}
			
		}
		
	}

}