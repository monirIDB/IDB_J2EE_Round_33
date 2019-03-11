import java.util.Scanner;
public class E1Q3{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value");
		int a=sc.nextInt();
		int c=0;
		for(int i=1; i<=a; i++){
			if(a%i==0){
				c++;
			}
		}
		if(c==2){
			System.out.println("The number "+a+" is prime");
		}else{
			System.out.println("The number "+a+" is not prime");
		}
	}
}