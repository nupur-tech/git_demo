package assignments;

import java.util.Scanner;

public class Math_multiply {
	
	int a,b,c,m,p,q,r,s,t,u,mult=1;
	float x,y,z;
	double l,n;
	
	public void Math()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers ");
		a=s.nextInt();
		b=s.nextInt();
		
	
	}
	
	public void Math1()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers ");
		x=s.nextFloat();
		y=s.nextFloat();
		
		
	}
	
	public void Math2()
	{
		Scanner s = new Scanner(System.in);
		
		System.out.println("Enter 2 numbers ");
		l=s.nextDouble();
		m=s.nextInt();
	
	}
	
	public void ArrayMath()
	{
		Scanner s = new Scanner(System.in);
		
		int arr[]=new int[5];
		
		System.out.println("Enter  numbers ");
		for(int i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		
		int mult=1;
		
		for(int i=0;i<5;i++)
		{
			mult= mult*arr[i];
		}
				
	}
	
	public void multiply()
	{
		c=a*b;
	}
	
	public void multiply1()
	{
		z=x*y;
	}

	public void multiply2()
	{
		n=l*m;
	}
	

	public void display()
	{
		System.out.println("r= " +c);
	}
	
	public void display1()
	{
		System.out.println("r= " +z);
	}

	public void display2()
	{
		System.out.println("r= " +n);
	}
	
	public void display3()
	{
		System.out.println("r= " +mult);
	}
	
	public static void main(String[] args)
	{
		Math_multiply m= new Math_multiply();
		m.Math();
		m.multiply();
		m.display();
		
		m.Math1();
		m.multiply1();
		m.display1();
		
		m.Math2();
		m.multiply2();
		m.display2();
		 
		m.ArrayMath();
		m.display3();
	
	}
	

}
