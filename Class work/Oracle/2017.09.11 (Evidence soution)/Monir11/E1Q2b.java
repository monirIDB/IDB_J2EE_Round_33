import java.util.Scanner;
import java.util.Arrays;
public class E1Q2b{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		
		int[] ar=new int[5];
		System.out.println("Enter your First value");
		int j=0;
		ar[j]=sc.nextInt();
		while(ar[j]!=-1){
			ar[j]=sc.nextInt();
		}
		Arrays.sort(ar);
		int a=ar[4];
		System.out.println("Largest number is: "+a);
	}
}