import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class Validation{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your ID");
		String id=sc.next();
		System.out.println("Enter your Name");
		String name=sc.next();
		System.out.println("Enter your email");
		String email=sc.next();
		System.out.println("Enter password");
		String pass=sc.next();
		Pattern p=Pattern.compile("^[0-9]+$");
		Pattern p1=Pattern.compile("^[A-Za-z]{9,20}+$");
		Pattern p2=Pattern.compile("^[a-zA-Z0-9]+@[a-z]+.[a-z]{2,4}+$");
		Pattern p3=Pattern.compile("^[A-Za-z0-9]{5,8}+$");
		Matcher m=p.matcher(id);
		Matcher m1=p1.matcher(name);
		Matcher m2=p2.matcher(email);
		Matcher m3=p3.matcher(pass);
		boolean b=m.matches();
		boolean b1=m1.matches();
		boolean b2=m2.matches();
		boolean b3=m3.matches();
		if(b==true){
			System.out.println("ID is: "+id);
		}else{
			System.out.println("ID is not valid");
		}
		if(b1==true){
			System.out.println("Name is: "+name);
		}else{
			System.out.println("Name is not valid");
		}
		if(b2==true){
			System.out.println("Email is: "+email);
		}else{
			System.out.println("Email is not valid");
		}
		if(b3==true){
			System.out.println("Password is: "+pass);
		}else{
			System.out.println("Password is not valid");
		}
	}
}