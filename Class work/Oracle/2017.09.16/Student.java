//Class:
//public is called access modifyer
//String class is in java.lang.String
//File is a class it is situated at java.io.File
import java.util.Date;
public class Student{
	int id;
	String name;
	public Student(){
		
	}
	public Student(int id, String name){
		this.id=id;
		this.name=name;
	}
	public String f1(){
		return "Hello from f1";
	}
	public int f2(){
		int x=500;
		return x;
	}
	public void f3(){
		name=name+"Hossain";
	}
}