package day3;
import java.util.Scanner;  
public class EvenOdd  
{  
	public static void main (String args[])  
	{  
		Customer customer = new Customer();
		customer.walkIn();
		customer.search();
		customer.purchase();
		
		Student.Display();
		System.out.println(Student.CLLG_NAME);
		
		Student ashish = new Student("ASW", 22, true);
		System.out.println("Name_student" + ashish.name);
		
		System.out.println(ashish.isEligible);
		
		//creating Scanner class object     
		Scanner scan = new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reading value from user  
		int num=scan.nextInt();  
		//method calling  
		for(int i = 0; i < 3; i++) {
			num = num + 5;
		}
		findEvenOdd(num);  
	}  
	//user defined method  
	public static void findEvenOdd(int num)  
	{  
		//method body  
		if(num%2==0)   
			System.out.println(num+" is even");   
		else   
			System.out.println(num+" is odd");  
	}  
}  