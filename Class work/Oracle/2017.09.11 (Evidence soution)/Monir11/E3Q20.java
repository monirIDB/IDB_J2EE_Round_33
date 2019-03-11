import java.util.Scanner;
public class E3Q20{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int c=0;
		while(a!=-1){
			c=c+a;
			System.out.println("Enter the value");
			a=sc.nextInt();
		}
		System.out.println("The result is:"+c);
	}
}