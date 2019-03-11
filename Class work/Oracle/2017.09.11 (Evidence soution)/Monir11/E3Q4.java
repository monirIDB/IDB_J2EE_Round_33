import java.util.Scanner;
public class E3Q4{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter Number");
		int a=sc.nextInt();
		System.out.println("Enter Power");
		int b=sd.nextInt();
		int c=1;
		for(int i=0;i<b;i++){
			c=c*a;
		}
		System.out.println("Result is: "+c);
	}
}