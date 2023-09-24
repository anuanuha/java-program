package objectclass;
import java.util.Scanner;
	public class ArrayToNumber {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the size of the array: ");
	        int size = scanner.nextInt();

	        int[] digitsArray = new int[size];
	        for (int i = 0; i < size; i++) {
	            System.out.print("Enter digit at index " + i + ": ");
	            digitsArray[i] = scanner.nextInt();
	        }

	        int number = convertToNumber(digitsArray);

	        System.out.println("Number: " + number);

	        scanner.close();
	    }

	    public static int convertToNumber(int[] digitsArray) {
	        int result = 0;

	        for (int digit : digitsArray) {
	            result = result * 10 + digit;
	        }

	        return result;
	    }
	}

