package passbtrefer;
	public class student {
		String name;
	    student(String name){
	    	this.name=name;
	    }
	     void changename(String newname) {
	    	 this.name=newname;
	     }
	}
	class main2{
		public static void main(String[] args) {
			student std=new student("anu");
				System.out.println(std.name);
			   changenewname(std);
				System.out.println(std.name);
			
		}
	    	 public static void changenewname(student s1)
	    	 {
	    		 s1.changename("anusha");
	    	 }
	     }



