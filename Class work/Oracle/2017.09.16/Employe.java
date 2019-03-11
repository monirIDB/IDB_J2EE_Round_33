//default value for integer 0
// default value for boolean false
//default value for string is null
//default value for date is null

public class Employe{
	int empid;
	String name;
	String email;
	public static void main(String[] args){
		Employe e1 = new Employe();
		e1.empid=100;
		e1.name="Habib";
		e1.email="habib@gmail.com";
		System.out.println(e1.empid);
		System.out.println(e1.name);
		System.out.println(e1.email);
	}
}