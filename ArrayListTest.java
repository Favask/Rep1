package com.favas.core.JavaOffline;
public class ArrayListTest {
public static void main(String[] args) {
	ArrayListImp test=new ArrayListImp();
	test.add(1);
	test.add(10);
	test.add("log");
	test.add("45");
	test.add("555");

	System.out.println(test.size());
	System.out.println(test.jet(2));
	System.out.println(test);
}
}
