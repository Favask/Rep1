package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Vowels {
      public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter word");
		String word=scn.next();
		int count=0;
		word.toLowerCase();
		for(int j=0;j<word.length();j++)
		{
			char ch=word.charAt(j);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
				{
						count++;
				}
		
		}
		System.out.println("no of vowells = "+count);
	}
}
