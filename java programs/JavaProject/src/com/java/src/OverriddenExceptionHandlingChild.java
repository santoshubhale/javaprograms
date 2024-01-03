package com.java.src;

public class OverriddenExceptionHandlingChild  extends OverriddenExceptionHandling{
	
		void msg() throws Exception {
			System.out.println("child method");
		}
		public static void main(String[] args) {
			OverriddenExceptionHandling ov = new OverriddenExceptionHandlingChild();
			
			try {
				ov.msg();
			}catch (Exception e) {
				
			}

		}

	}


