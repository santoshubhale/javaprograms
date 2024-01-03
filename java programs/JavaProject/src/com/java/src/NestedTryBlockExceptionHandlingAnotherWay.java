package com.java.src;

import java.io.FileNotFoundException;

public class NestedTryBlockExceptionHandlingAnotherWay {

	public static void main(String[] args) {
		try {
			try {
				try {
					int a= 50/0;
					System.out.println(a);
				}catch (NullPointerException e) {
					System.out.println(e);
				}catch (StringIndexOutOfBoundsException e) {
					System.out.println(e);
				}catch (ArrayIndexOutOfBoundsException e) {
					System.out.println("hi");
				}catch (Exception e) {
					System.out.println(e);
				}finally {
					System.out.println("hi");
				}
				}
				
			
		}

	}

}
