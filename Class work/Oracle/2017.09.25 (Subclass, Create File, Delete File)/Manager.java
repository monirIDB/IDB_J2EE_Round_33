
//private variable and private method can't become inheritance.
//If we change the super class method into subclass then it is called over ridding.
//
public class Manager extends Employee{
	public String department="CSE";
	public static void main(String[] args){
		Manager e1=new Manager();
		System.out.println(e1.department);
		System.out.println(e1.name);
	}
}