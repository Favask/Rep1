package com.favas.core.JavaOffline;

public class PrimeNo {
	public static void main(String[] args) {
	
		for(int k=1;k<=100;k++)//1 2 
		{
			int count=0;//0
			for(int i=1;i<=k;i++)//1
			{
				
				if(k%i==0)//true
				{
					count+=1;//1
				}
			}
			if(count==2)//false
			{
				System.out.println(k);
			}
			
			
		}
	}

}
