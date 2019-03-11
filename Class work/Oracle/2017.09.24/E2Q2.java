import java.util.Scanner;
public class E2Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Height of the Rectangle");
		float a=sc.nextFloat();
		System.out.println("Enter the Width of the Rectangle");
		float b=sc.nextFloat();
		float c=a*b;
		
		System.out.println("The area of the rectangle is: "+c);
	}
}