import java.util.Scanner;
public class E1Q2{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 1st value");
		int a=sc.nextInt();
		System.out.println("Enter the 2nd value");
		int b=sc.nextInt();
		System.out.println("Enter the 3rd value");
		int c=sc.nextInt();
		if(a>b && a>c){
			System.out.println("The largest number is: "+a);
		}else if(b>c){
			System.out.println("The largest number is: "+b);
		}else{
			System.out.println("The largest number is: "+c);
		} 
	}
}