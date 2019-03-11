import java.util.Scanner;
public class TestMath{
	public static void main(String[] args){
		int a;
		int b;
		int c;
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Value 1");
		a=sc.nextInt();
		System.out.println("Enter Value 2");
		b=sc.nextInt();
		System.out.println("Enter Value 3");
		c=sc.nextInt();
		Calculation c1=new Calculation();
		int r=c1.doAdd(a,b,c);
		System.out.println("Sum is: "+r);
		int t=c1.doSub(a,c);
		System.out.println("Subtraction is: "+t);
		
	}
}