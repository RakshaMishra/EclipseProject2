package com.kodnest.package2;

 class Parent{
	int age;
	public Parent()
	{
		System.out.println("1");
	}
	public Parent(int age)
	{
		super();
		System.out.println("2");
	}

}

class Class extends Parent
{  int id;
	public Class(int id)
	{
		super();
		System.out.println("3");
	}
	public Class()
	{
		super(10);
		System.out.println("4");
	}
}
