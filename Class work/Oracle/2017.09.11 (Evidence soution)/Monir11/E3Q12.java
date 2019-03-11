import java.util.Scanner;
public class E3Q12{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int a=sc.nextInt();
		int c=0;
		for(int i=1;i<=a;i++){
			if(a%i==0){
				c++;
			}
		}
		if(c==2){
			System.out.println("The number is Prime");
		}else{
			System.out.println("The number is not Prime");
		}
	}
}