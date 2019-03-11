import java.util.Scanner;
public class OddEven{
	public static void main(String[] args){
		Scanner sd=new Scanner(System.in);
		System.out.println("Enter a Number");
		int a=sd.nextInt();
		if(a%2==0){
			System.out.println("The number is Even");
		}else{
			System.out.println("The number is Odd");
		}
	}
}