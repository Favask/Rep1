package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Jva {
		public static void main(String[] args) {
				Scanner scn=new Scanner(System.in);
				System.out.println("enter a string");
				String s=scn.next();
				
				String s1="";
				char[] c=s.toCharArray();
				
				for(int i=0;i<c.length;i++)                           //0 
				{
					int flag=0;                               //flse
					for(int j=0;j<c.length;j++)                     //1 2
					{
						if((c[i]==c[j]))                              //h e, h l,h l,h o, h o
						{                                             //l l,
							flag++;
							
						}
					}
						if(1==flag)                                     //
						{   
							s1+=c[i];                                 //h e l l o
						}
						
					}
					System.out.println(s1);
				}

}
