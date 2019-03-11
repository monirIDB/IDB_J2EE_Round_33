import java.util.Scanner;
import java.util.ArrayList;
public class Exam1Q1{
	public static void main(String[] args){
		Scanner sc= new Scanner(System.in);
		ArrayList<Integer> a=new ArrayList<Integer>();
		int sum=0;
		double count=0;
		double avg=0;
		System.out.println("Enter value");
		
		 int x=sc.nextInt();
		
		while(x!=-1){
			a.add(x);
			if(x>0){
				count++;
				sum=sum+x;
			}
			System.out.println("Enter value");
			x=sc.nextInt();
		}
		
		
		for(int i=0; i<a.size(); i++){
			System.out.print(a.get(i)+" ");
		}
		System.out.println();
		avg=sum/count;
		System.out.println("The avarage of the number is: "+avg);
	}
}