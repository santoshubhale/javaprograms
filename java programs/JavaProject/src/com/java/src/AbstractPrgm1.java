package com.java.src;

abstract class AbstractPrgm1 {

	abstract void  run() ;
}
class honda extends AbstractPrgm1 {
void run() {
	System.out.println("Run Safely");
}

public static void main(String[] args) {
	
	AbstractPrgm1 ap = new honda();
	ap.run();

	}

}
