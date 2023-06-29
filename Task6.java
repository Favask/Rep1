package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Task6 {
	public static void main(String[] args)
	{
		int a=1;
		Scanner scn=new Scanner(System.in);
	    System.out.println("enter number");
		int num=scn.nextInt();
		for(int i=1;i<=num;i++)
		{
			if(i==(num/2)+1)
			{
			    for(int j=1;j<=num;j++)
			    {
			    	System.out.print(j);
			    	System.out.println();
			    }
			   
			}
		}
	}
}	