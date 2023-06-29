package com.favas.core.JavaOffline;

public class PyramidDemo {
public static void main(String[] args) {
	int a=6;
	for(int i=0;i<a;i++)
	{
		for(int j=a-i;j>1;j--)
		{
			System.out.print(" ");
		}	
		System.out.print(1);
		for(int j=1 ;j<=(i*2)/2;j++)
		{
			System.out.print(j+1);
		
     	}
		for(int k=(i*2)/2;k>0;k--)
		{
			System.out.print(k);
		}
		System.out.println();
}
}
}