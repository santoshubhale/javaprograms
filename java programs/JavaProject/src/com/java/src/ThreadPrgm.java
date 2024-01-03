package com.java.src;

public class ThreadPrgm extends Thread{
	public void run() {
		for(int i=0; i<=10; i++) {
			System.out.println("Run Thread");
		}
	}
}
class ThreadTest {
	public static void main(String[] args) {
		ThreadPrgm tp = new ThreadPrgm();
		tp.start();
		for(int i = 0; i<=10; i++) {
			System.out.println("main Thread ");
		}
		
	
	}

}
