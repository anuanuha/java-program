package inbuiltmathods;
import java.io.IOException;
import java.util.Scanner;
public class shutdown_laptop {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the time");
		int time=sc.nextInt();
			Runtime r=Runtime.getRuntime();
			
			System.out.println("the laptop will shutdown within "+time +"seconde");

			
			try {
				r.exec("shutdown -s -t "+time);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
	}
	

}
