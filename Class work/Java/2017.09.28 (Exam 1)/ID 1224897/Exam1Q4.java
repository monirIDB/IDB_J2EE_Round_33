import java.util.Scanner;
public class Exam1Q4{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int a=sc.nextInt();
		int fact=1;
		for(int i=1; i<=a; i++){
			fact=fact*i;
		}
		System.out.println("The factorial of "+a+" is: "+fact);
		int c=0;
		for(int i=1; i<=a; i++){
			int b=a%i;
			if(b==0){
				c++;
			}
		}
		if(c==2){
			System.out.println("The number "+a+" is a prime number");
		}else{
			System.out.println("The number "+a+" is not a prime number");
		}
		if(a/2==0){
			System.out.println("The number "+a+" is a even number");
		}else{
			System.out.println("The number "+a+" is a odd number");
		}
	}
}