import java.util.Scanner;
public class factorial
 {
	public static void  main(String args[])
   {
           Scanner in = new Scanner(System.in);
           System.out.println("Enter the value you want to find the factor of");
           int value = in.nextInt();
           System.out.println(value + " Factorial equals " +  toFactorial(value));

    }
	public static int toFactorial(int value) //method to calculate the factorial of a number
         {
           if(value == 0) return 1;
           for(int i=value-1; i>0; i--) value *= i; 
           return value; 
         }
 
  } 
