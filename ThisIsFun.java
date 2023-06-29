package com.favas.core.JavaOffline;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class ThisIsFun {
	public static void main(String[] args) { 
		ThisIsFun j=new ThisIsFun();
		HashMap<String ,Integer> m1=new HashMap<String , Integer>();
		m1.put("java",23);
		m1.put("android",26);
		System.out.println(m1);
		LinkedHashMap<Object, ThisIsFun>m2=new LinkedHashMap<>();
		m2.put("java", j);
		System.out.println(m2);
	}
public int ThisIsFun()
		{
			return 1;
		}
	
	

}
