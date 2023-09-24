package objectclass;

public class tostringmethod{
public static void main(String[] args) {
	
	sample s1= new sample("benz",356877,"red");
	System.out.println(s1.toString());
	sample s2= new sample("swift",3566787,"blue");
	System.out.println(s2.toString());
	
}
public class sample{
	String car_name;
	int car_price;
	String car_colour;
	
	public sample(String car_name, int car_price, String car_colour) {
		//super();
		this.car_name = car_name;
		this.car_price = car_price;
		this.car_colour = car_colour;
	}

	@Override
	public String toString() 
	{
		// TODO Auto-generated method stub
		return this.car_name+" "+this.car_price+" "+this.car_colour ;
	}
}	

}
