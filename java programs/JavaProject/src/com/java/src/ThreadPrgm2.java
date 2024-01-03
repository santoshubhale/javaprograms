package com.java.src;

public class ThreadPrgm2 implements Runnable {
	
	public void run(){
		System.out.println(Thread.currentThread().getName());
		for(int i =0; i<=10; i++) {
			System.out.println("Run Method");
		}
	}
}
class ThreadTest2{
	public static void main(String[] args) {
		ThreadPrgm2 tp = new ThreadPrgm2();
		Thread t = new Thread(tp);
		t.start();
		System.out.println(Thread.currentThread().getName());
		for(int i=0; i<=10; i++) {
			System.out.println("Mian Method");
		}

	}

}
