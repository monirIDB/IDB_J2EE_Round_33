//If a method is static then we have call the method with class name.
//E1Q9.Retrieve Email address from user and validate it & Retrieve password from user and validate whether it contains 7 characters or not?

import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class E1Q9{
	public static void main(String[] args){
		String a="monir@gmail.com";
		String c="monir12345";
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