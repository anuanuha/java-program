package objectclass;

public class string_to_array {
public static void main(String[] args) {
	String str="JAVA";
	char[] arr=str.toCharArray();
	for (int i = 0; i < arr.length; i++) {
		System.out.print(arr[i]+" ");
	}
		System.out.println("\n"+arr[2]);
		
}
}
