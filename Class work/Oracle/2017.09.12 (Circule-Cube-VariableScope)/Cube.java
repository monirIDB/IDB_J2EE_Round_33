import java.util.Scanner;
public class Cube{
	public static int length;
	public static int width;
	public static int height;
	public static int cube;
	public static void main(String[] ars){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter length");
		length=sc.nextInt();
		System.out.println("Enter Width");
		width=sc.nextInt();
		System.out.println("Enter height");
		height=sc.nextInt();
		cube=f1(length, width, height);
		System.out.println("Cube is: "+cube);
	}
	public static int f1(int x, int y, int z){
		int a=x*y*z;
		return a;
	}
}