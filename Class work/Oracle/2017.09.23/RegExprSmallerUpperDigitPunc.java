import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class RegExprSmallerUpperDigitPunc{
	
    public static String st="Dhaka@1#";
	public static void main(String[] args){
	   //conditions:
	   //min 8 char,
	   //min on specialchar,
	   //min one lowercase,
	   //min one uppercase,
	   if(length()&& spchar()&& lower()&& upper()&& mumeric()){
		  System.out.println("Password OK"); 
	   }
	   
	}
	public static boolean length(){
		boolean b2 = Pattern.matches("^.{8,8}$", st);
		if(b2){
			return true;
		}else{
			System.out.println("Must be 8 in length");
			return false;
		}
		
	}
	public static boolean spchar(){
		boolean b2 = Pattern.matches("^.*\\p{Punct}+.*$", st);
		if(b2){
			return true;
		}else{
			System.out.println("Must have at least one special char");
			return false;
		}
		
	}
	public static boolean lower(){
		boolean b2 = Pattern.matches("^.*[a-z]+.*$", st); //shortcut
		if(b2){
			return true;
		}else{
			System.out.println("Must have at least one lower char");
			return false;
		}
		
	}
	public static boolean upper(){
		boolean b2 = Pattern.matches("^.*[A-Z]+.*$", st);
		if(b2){
			return true;
		}else{
			System.out.println("Must have at least one Upper char");
		   return false;
		}
		
	}
	public static boolean mumeric(){
		boolean b2 = Pattern.matches("^.*[0-9]+.*$", st);
		if(b2){
			return true;
		}else{
			System.out.println("Must have at least one munber");
			return false;
		}
		
	}

}