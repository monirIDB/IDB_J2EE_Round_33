import java.util.Scanner;
public class Circle02{
	public static Scanner sc=new Scanner(System.in);
	public static int radius;
	public static double area;
	public static void main(String[] args){
		System.out.println("Enter value");
		radius=sc.nextInt();
		area = f1(radius);
		System.out.println("Area is: "+area);
	}
	public static double f1(int x){
		double r=Math.PI*Math.pow(x,2);
		return r;
	}
}