package com.favas.core.JavaOffline;

public class Multithreading implements Runnable {
	public void run()
	{
		System.out.println("char printing statred");
		for(char c='a';c<'z';c++)
		{
			System.out.println(c);
		}
		System.out.println("char printing is ended");
	}
}
