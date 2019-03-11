import java.util.Scanner;
public class E2Q4a{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter value");
		int i=0;
		int[] a=new int[i];
		a[i]=sc.nextInt();
		while(a[i]!=-1){
			//a[i]=sc.nextInt();
			i++;
			System.out.println("Enter value");
			a[i]=sc.nextInt();
		}
	}
}