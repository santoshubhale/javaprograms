package com.java.src;

public class FinalizeKey {

	public static void main(String[] args) {
		    FinalizeKey fk = new FinalizeKey();        
		          
		        System.out.println("Hashcode is: " + fk.hashCode());           
		        fk = null;    
		         
		        System.gc();     
		        System.out.println("End of the garbage collection");     
		    }     
		     
		    protected void finalize()     
		    {     
		        System.out.println("Called the finalize() method");     
		    }     

	}


