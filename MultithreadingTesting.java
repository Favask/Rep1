package com.favas.core.JavaOffline;

public class MultithreadingTesting {
	public static void main(String[] args) {
		System.out.println("num printing is started");
		Runnable a1=new Multithreading();
		Thread a2=new Thread(a1);
		a2.start();
		
		for(int j=0;j<20;j++)
		{
			System.out.println(j);
		}
		System.out.println("num printing is ended");
	}

}
