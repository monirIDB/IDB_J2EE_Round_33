import java.util.Scanner;
public class E1Q2a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your First value");
		int a=sc.nextInt();
		System.out.println("Enter your Sconed value");
		int b=sc.nextInt();
		System.out.println("Enter your Thired value");
		int c=sc.nextInt();
		if(a<b&c<b){
			System.out.println("Largest number is "+b);
		}else if(a<c){
			System.out.println("Largest number is "+c);
		}else{
			System.out.println("Largest number is "+a);
		}
	}
}