

package assignments;

import java.util.Scanner;

public class MathOperation {
	
	double x;
	double y,r;
	
	public void Math()
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any 2 numbers ");
		x=s.nextDouble();
		y=s.nextDouble();
	}
	
	public void add()
	{
		 r=x+y;
	}
	
	public void multiply()
	{
	 r=x*y;
	}
	
	public void pow()
	{
		r=Math.pow(x,y);
		
		
	}
	
	public void display()
	{
		System.out.println("r= " +r);
	}
	
	public static void main(String[] args)
	{
		MathOperation m= new MathOperation();
		m.Math();
		m.add();
		m.display();
		m.multiply();
		m.display();
		m.pow();
		m.display();
	}
}
