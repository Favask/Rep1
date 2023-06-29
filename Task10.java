package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Task10 {
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println("enter a string");
			String s=scn.next();
			String dup="";
			for(int i=0;i<s.length();i++)
			{
				if(s.indexOf(i)!=-1)
				{
					char c=s.charAt(i);
					int k=getOccurence(s,c);
					dup+=s.indexOf(i);
					
				}
				
				
				
			}
		}		
				static int getOccurence(String s,char c)
				{
					String d=s.replace(c+"", "");
					return s.length()-d.length();
				}
			
				
			
					
					
			
}

