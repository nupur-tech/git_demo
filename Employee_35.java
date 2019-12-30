package assignments;

import java.util.Scanner;

public class Employee_35 
{
	static int empNo;
	static float salary;
	static float totalSalary;
	static Scanner s = new Scanner(System.in);
	
	public Employee_35( float salary) 
	{
		this.salary=salary;
		empNo++;
		totalSalary = totalSalary + salary;
	}
	
	public static void get()
	{
		System.out.println("Enter Salary");
		salary=s.nextFloat();
		empNo++;
		totalSalary = totalSalary + salary;
	}
	
	public static void total()
	{
		System.out.println("Enter emp no " +empNo);
		System.out.println("Salary " +salary);
		System.out.println("Total Salary " +totalSalary);
		
	}
	
	static
	{
		empNo=0;
		salary=0;
	}
	
	
	public static void main(String[] args) {
		{
			Employee_35 e = new Employee_35(salary);
			
			System.out.println("Enter the number of employee ");
			int no=s.nextInt();
			
			int []arr = new int[5];
			
			for(int i=0;i<arr.length;i++)
				{
					e.get();
					e.total();
		
				}	
		}
	}
}


	                                                                                                                                                                                             
