package Primenumber;

import java.util.Scanner;

public class nextprimenumofgivennum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numner");
		int num = sc.nextInt();

		for (int i = num + 1; i <= 1000; i++) {

			int no = i;
			boolean flag = true;
			for (int j = 2; j < no; j++) {
				if (no % j == 0) {
					flag = false;
					break;
				}
			}

			if (flag == true) {
				System.out.println("next prime number of given number is:" + no);
				break;
			}
		}
	}
}