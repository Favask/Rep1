package com.favas.core.JavaOffline;

public class Arrownum
{
	
		  public static void main(String[] args) {
		    int rows = 5;

		    for (int i = 1; i <= rows; i++)
		    {
		      for (int j = 1; j <= i;j++) 
		      {
		        System.out.print(j+" ");
		      }
		      System.out.println();
		  
		  }
		    for(int i=1;i<=rows;i++)//1
		    {
		    	for(int j=1;j<=5-i;j++)//1
		    	{
		    		System.out.print(j+" ");//1 2 3 4 5 ,
		    	}
		    	System.out.println();
		    }
		}

}
