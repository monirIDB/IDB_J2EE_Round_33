import java.util.Scanner;
public class E1Q4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int fact=1;
		if(a<=1){
			fact=1;
		}
		for(int i=1; i<=a; i++){
			fact=fact*i;
		}
		System.out.println("The Factor of "+a+" is: "+fact);
	}
}