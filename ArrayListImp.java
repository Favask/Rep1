package com.favas.core.JavaOffline;

public class ArrayListImp 
{
	Object[] arr=new Object[3];
	private int p=0;
	public void add(Object i)
	{
		if(p>=arr.length)
			{
				increase();
			}
         arr[p++]=i;
		
	}
	public void increase()
	{
		int newSize=arr.length+1;
		Object[] newArr=new Object[newSize];
		for(int j=0;j<arr.length;j++)
		{
			newArr[j]=arr[j];
		} 
		
		arr=newArr;
	}
	int size()
	{
		return p;
	}
	Object jet(int index)
	{
		if(index>size())
		{
			throw new IndexOutOfBoundsException();
		}
		return arr[index];
	}
	public String toString()
	{
		if(size()==0)
		{
			return null;
		}
		else {
		String S="["+arr[0];
		for(int i=1;i<arr.length;i++)
		{
			S+=" "+arr[i];
		}
		return S+"]";
		}
	}
}

