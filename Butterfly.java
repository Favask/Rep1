package com.favas.core.JavaOffline;

public class Butterfly {
	public static void main(String[] args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(i==j||j==5||i+j==5+1||j==1)
				{
				System.out.print("*"+" ");	
				
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
		}
	}

}
