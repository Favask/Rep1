package com.favas.core.JavaOffline;

public class LinkedListImp {
	private Node start;
	private Node last;
	int count=0;
	
void add(Object ele)
	{
		if(start==null)
		{
			start=new Node(ele);
			last=start;
		}
		else
		{
		last.next=new Node(ele);
		last=last.next;
		}
		
	}
int size()
	 {
		 return count;
	 }
public Object get(int a)
	 {
	if(a>size())
	{
		throw new IndexOutOfBoundsException();
	}
	else {
		Node p=start;
		for(int i=1;i<=a;i++)
		{
			p=p.next;
		}
		return p.element;
	 }
	 }
@Override
public String toString()
{
	if(size()==0)
	{
		return"[]";
	}
	String s="["+start.element;
	Node n=start;
	while(n.next!=null)
	{
	 n=n.next;
	 s+=","+n.element;
	}
	return s+"]";
	}
class Node
	{
		Object element;
		Node next;
		Node(Object ele)
		{
			element=ele;
			count++;
		}
	}
	

}

