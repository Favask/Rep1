package com.favas.core.JavaOffline;

public class Arrow {
	public static void main(String[] args) {
		for(int i=1;i<6;i++)
		{
			for(int j=1;j<=3;j++)
			{
				if(j==1||i==j||i+j==6||i==3)
				{
				System.out.print(" *");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
			
		}
		
		
	}

}
