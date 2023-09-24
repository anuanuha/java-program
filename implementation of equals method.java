package objectclass;

public class equalsmethod {
	public static void main(String[] args) {
		car c1 = new car("audi", 67878, "red");
		System.out.println(c1.equals(c1));
	}
}

 class car {
	String car_name;
	int car_price;
	String car_colour;
	public car(String car_name, int car_price, String car_colour) {
		// super();
		this.car_name = car_name;
		this.car_price = car_price;
		this.car_colour = car_colour;
	}
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		car c1 = (car) obj;
		return (this.car_colour == c1.car_colour);
	}
}
