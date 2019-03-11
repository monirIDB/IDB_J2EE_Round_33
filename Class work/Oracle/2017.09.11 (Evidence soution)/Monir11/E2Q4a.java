//E2Q4a. Read some integer into an array untile we type -1.
import java.util.Scanner;
import java.util.ArrayList;
public class E2Q4a{
	//int 5 is a primitive type data
	//Integer 5 is a object type data
	public static void main(String[] args){
		ArrayList<Integer> list1 = new ArrayList();
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		int count=0;
		while(n!=-1){
			list1.add(n);
			count++;
			n=sc.nextInt();
		}
		for(int i:list1){
			System.out.println(i);
		}
	}
}