import java.util.Scanner;
public class Circle01{
	public static int radius;
	public static double area;
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius");
		radius=sc.nextInt();
		double area = f1(radius);
		System.out.println("Area is: "+area);
	}
	public static double f1(int x){
		double r=Math.PI*Math.pow(x,2);
		return r;
	}
}