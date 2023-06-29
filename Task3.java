package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Task3 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int n=scn.nextInt(); //153
		int result=0,temp=n;
		while(temp!=0)
		{
			int digit=temp%10;//3
			int cube=1;
			for(int i=0;i<3;i++)
          		{
				cube*=digit;//1*3*3*3
          		}
			result+=cube;//27
			temp/=10;
			
			
		}
		if (result==n)
		{
			System.out.println("amstrng");
		}
		else {
		System.out.println("not");
		
		}
	}

}
