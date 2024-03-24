package phase1.practiceProjects;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) 
	{
		 Scanner sc = new Scanner(System.in);
		 
		 while(true)
		 {
			 System.out.println("\nChoose an operation :");
			 System.out.println("1. Addition");
			 System.out.println("2. Subtraction");
	         System.out.println("3. Multiplication");
	         System.out.println("4. Division");
	         System.out.println("5. Exit");   
	         
	         int n = sc.nextInt();
	         
	         if(n == 5)
	         {
	        	 System.out.println("Calculator ended");
	             break;
	         }
	         
	         System.out.print("Enter first number: ");
	         double n1 = sc.nextDouble();

	         System.out.print("Enter second number: ");
	         double n2 = sc.nextDouble();
	         
	         switch(n)
	         {
	         	case 1:
	         		System.out.println(n1+"+"+n2+"="+(n1 + n2));
	         		break;
	         	case 2:
		        	 System.out.println(n1+"-"+n2+"="+(n1 - n2));
	                 break;
	         	case 3:
		        	 System.out.println(n1+"*"+n2+"="+(n1 * n2));
	                 break;
	         	case 4:
	         		if(n2==0)
	         			System.out.println("Can not divide by zero");
	         		else
	         			System.out.println(n1+"/"+n2+"="+(n1 / n2));
	                break;
	         }
		 }
		 sc.close();
	}

}
