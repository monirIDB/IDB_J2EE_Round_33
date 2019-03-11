import java.util.Scanner;
public class E3Q14{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int a=sc.nextInt();
		int b=1;
		for(int i=0; i<3; i++){
			b=b*a;
		}
		System.out.println("Result is: "+b);
	}
}