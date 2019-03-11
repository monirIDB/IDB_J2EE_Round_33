import java.util.Scanner;
public class E1Q11a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount");
		int a=sc.nextInt();
		if(a<100){
			int c=a;
			System.out.println("No disccount");
			System.out.println("The amount to be paid: "+c);
		}
		if(a>=100 && a<=300){
			String d="10%";
			int b=a*10/100;
			int c=a-b;
			System.out.println("The percentage of disccount is: "+d);
			System.out.println("The amount to be paid: "+c);
		}
		if(a>=300 && a<=700){
			String d="15%";
			int b=a*15/100;
			int c=a-b;
			System.out.println("The percentage of disccount is: "+d);
			System.out.println("The amount to be paid: "+c);
		}
		if(a>=700 && a<=1000){
			String d="20%";
			int b=a*20/100;
			int c=a-b;
			System.out.println("The percentage of disccount is: "+d);
			System.out.println("The amount to be paid: "+c);
		}
		if(a>1000){
			String d="25%";
			int b=a*25/100;
			int c=a-b;
			System.out.println("The percentage of disccount is: "+d);
			System.out.println("The amount to be paid: "+c);
		}
	}
}