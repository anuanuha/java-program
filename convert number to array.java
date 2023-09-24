package Overloading;
	import java.util.ArrayList;
	import java.util.Scanner;

	public class NumberToArray {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();
	        
	        int[] digitsArray = convertToArray(number);
	        
	        System.out.print("Array of digits: ");
	        for(int i=0;i<digitsArray.length;i++) {
	        	System.out.print(digitsArray[i]+" ");
	        }
	        
	        scanner.close();
	    }
	    
	    public static int[] convertToArray(int number) {
	        ArrayList<Integer> digitsList = new ArrayList<>();
	        
	        while (number > 0) {
	            int digit = number % 10;
	            digitsList.add(0, digit); // Adding at the beginning to maintain order
	            number /= 10;
	        }
	        
	        int[] digitsArray = new int[digitsList.size()];
	        for (int i = 0; i < digitsList.size(); i++) {
	            digitsArray[i] = digitsList.get(i);
	        }
	        
	        return digitsArray;
	    }
	}



