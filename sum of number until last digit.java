package getandset;

public class sum_of_nom_till_unit_digit {
	public static void main(String[] args) {
		int no=9989;
		while(no>9) {
			no=add(no);
		}
		System.out.println(no);
	}
static int add(int no) {
	int sum=0;
	while(no!=0)
	{
		int rem=no%10;
		sum+=rem;
		no=no/10;
	}
	return sum;
}
}

