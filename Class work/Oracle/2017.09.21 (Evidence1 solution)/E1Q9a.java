import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;
public class E1Q9a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your email");
		String a=sc.next();
		System.out.println("Enter password");
		String c=sc.next();
		Pattern p=Pattern.compile("^[a-zA-Z0-9]+@[a-z]+.[a-z]{2,4}+$");
		Pattern p1=Pattern.compile("^[A-Za-z0-9]{5,8}+$");
		Matcher m=p.matcher(a);
		Matcher m1=p1.matcher(c);
		boolean b=m.matches();
		boolean b1=m1.matches();
		if(b==true){
			System.out.println("Email is: "+a);
		}else{
			System.out.println("Email is not valid");
		}
		if(b==true){
			System.out.println("Password is: "+c);
		}else{
			System.out.println("Password is not valid");
		}
	}
}