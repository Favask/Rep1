package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Chara2 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("enter a word");
		String word=scn.next();
		char c=' ';
		char str1=getcout(word,c);
		
		
		for(int i=0;i<word.length();i++)
		{
			System.out.print(str1);
		}
	}
static char getcout(String word,char c)
{
	return word.charAt(1);
}
}
