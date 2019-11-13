package com.test.tech;

public class Q5 {
	
public static Object Thread1 = new Object();
public static Object Thread2 = new Object();
	   
public static void main(String args[]) {
	      DeadL1 a= new  DeadL1();
          DeadL2 b = new DeadL2();
	      a.start();
	      b.start();
	   }
	   
private static class DeadL1 extends Thread {
	 public void run() {
	 synchronized (Thread1) {
	 System.out.println("Lock 1");
	            
	            try { Thread.sleep(10); 
	            }
	            catch (InterruptedException e) {
	            	
	            }
 System.out.println("Lock 2");
	            
    synchronized (Thread2) {
    System.out.println("Lock 1&2");
}
	 }
 }
}
private static class DeadL2 extends Thread {
	    public void run() {
	         synchronized (Thread2) {
	            System.out.println("Lock 2");
	            
	            try { Thread.sleep(2000); 
	            }
	            catch (InterruptedException e) {
	            	
	            }
	            System.out.println("Lock 2");
	            
	            synchronized (Thread1) {
	               System.out.println("Lock 1&2");
}
	            }
}
} 
}

