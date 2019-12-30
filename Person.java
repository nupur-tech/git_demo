package assignments;

import java.util.Scanner;

public class Person {
	
	int age;
	String name;
	
	public Person()
	{
		 age=18;
		 name="abc";
	}

	public Person(int age, String name)
	{
		this.age = age;
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("Name "+name+ "Age "+age);
	}
	
	public static void main(String[] args) 
	{
		Person p = new Person();
		p.display();
		
		Scanner s = new Scanner(System.in);
		
		Person p1 = new Person(24 , "Nupur");
		p1.display();
	
		System.out.println("Enter the age ");
		int age= s.nextInt();
		
		System.out.println("Enter name ");
		String name =s.next();
		
	}
}
