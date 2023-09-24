package getandset;

public class encapsulation {
	public static void main(String[] args) {
		facebook f1=new facebook();
		System.out.println(f1.getpwd());
		f1.setpwd("@2345");
		//System.out.print(f1.setpwd("@2345"));
		
	}
}
	class facebook{
		private String pwd="@1234";
	public String getpwd() {
		return pwd;
	}
	public void setpwd(String pwd) {
		this.pwd=pwd;
		System.out.println(pwd);
	}
	}


