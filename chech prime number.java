package Primenumber;
import java.util.Scanner;
public class checkprime {
	  public static void main(String[] args) {
	        // Create a Scanner object to read user input
	        Scanner scanner = new Scanner(System.in);

	        // Get user input
	        System.out.print("Enter a number: ");
	        int num = scanner.nextInt();
	        checkprimnum(num);
	  }
      static void checkprimnum(int num) {
	        boolean flag = true;
	       for(int i=2;i<num;i++)
	       {
	    	   if(num%i==0)
	    	   {
	    		   flag=false;
	    		   break;
	    	   }
	       }
	        if (flag==true) {
	            System.out.println(num + " is a prime number.");
	        }
	        else
	        {
	            System.out.println(num + " is not a prime number.");
	        }
	    }
	}


