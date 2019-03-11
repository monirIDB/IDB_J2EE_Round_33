public class Circle{
	public static int radius=10;
	public static int area;
	public static void main(String[] args){
		double a = f1(radius);
		System.out.println("Area is: "+a);
	}
	public static double f1(int x){
		double r=Math.PI*x*x;
		return r;
	}
}