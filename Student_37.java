/*37.	 Make list of Students having name, roll no., age, score. 
Write a program to accept 10 students record and arrange the 
Students based on the score group [0-50],[50-65],[65-80],[80-100]. */


package assignments;

import java.lang.reflect.Array;
import java.util.Scanner;

public class Student_37
{
	protected static String name;
	protected static int roll_no;
	protected static int age;
	protected static float score;

	public Student_37(String name, int roll_no, int age, float score)
	{
		this.name = name;
		this.roll_no = roll_no;
		this.age = age;
		this.score = score;
	}
	
	public static void main(String[] args) 
	{
		Student_37[] arr = new Student_37[5];
	for(int i=0 ; i<arr.length ; i++)
	{
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the name of student");
		name = s.next();
		
		System.out.println("Enter the roll no");
		roll_no = s.nextInt();
		
		System.out.println("Enter the age");
		age = s.nextInt();
		
		System.out.println("Enter the score");
		score = s.nextFloat();
	}	
	
	 if(score>=80)
     {
         System.out.print("A");
     }
     else if(score>=60 && score<80)
     {
        System.out.print("B");
     } 
     else if(score>=40 && score<60)
     {
         System.out.print("C");
     }
     else
     {
         System.out.print("D");
     }
}
}

