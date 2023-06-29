package com.favas.core.JavaOffline;

import java.util.Scanner;

public class Plusnumber{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter num");
		int num=scn.nextInt();		
		int a=1;
        for(int i=1;i<num;i++)                                         //1,2,3
         {
        	    for(int j=1;j<num;j++)                                 //1,2,3,4,5
        	    {
        	    	  if(i==num/2)	                                   //
                      {
                    	 for(int k=1;k<num;k++)                     //1
                    	 {
                    	    System.out.print(k);  
                    	    
                          }
                    	 break;
                    	 
        	          } 
        	     
                     if(j==num/2)                                       //__1___
                                                                     //__2___   
                      {  
                    	 if(a==num/2){
                    		 a+=1;//__3___ 12345
                    	 }
        		    	     System.out.print(+a++ );
        	     
                   	 }
                 
        	          else
        	             {
        	              
        	        	     	 System.out.print(" ");
        	              	 }
                 	
                   
                     
        
         }
        	    System.out.println();
         }
	}      
}