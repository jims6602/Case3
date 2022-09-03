package org.pictolearn.docker;

public class HelloWorldPing {
	
	public static void main(String args[]) throws Exception{
		for(int i = 0 ; i < 10000; i++){
			System.out.println("Hi Ping " + i );
			Thread.sleep(1000);
		}
	}
}
