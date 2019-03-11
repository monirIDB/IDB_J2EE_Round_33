import java.util.Scanner;
public class E1Q1{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a%2==0){
			System.out.println("The number "+a+ " is Even");
		}else{
			System.out.println("The number "+a+ " is Odd");
		}
	}
}