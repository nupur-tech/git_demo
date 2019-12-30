
/*36.	Create class Product (pid, price, quantity) with parameterized constructor. 

Create a main function in different class (say XYZ) and perform following task:
a.	Accept five product information from user and store in an array
b.	 Find Pid of product with highest price.
c.	Create method (with array of product’s object as argument) in XYZ class to calculate
 and return total amount spent on all products.  
(amount spent on single product=price of product * quantity of product)*/


package assignments;

public class Product_36 
{
	protected                                                                                                          pid;
	protected int quant; 
	protected double price;
	
	public Product_36(int pid, double price , int quant)
	{
		this.pid=pid;
		this.price=price;
		this.quant=quant;
	}
	
	
}
