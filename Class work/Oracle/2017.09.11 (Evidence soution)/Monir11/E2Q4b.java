//E2Q4a. Read some String into an array untile we type -x.
import java.util.Scanner;
import java.util.ArrayList;
public class E2Q4b{
	//int 5 is a primitive type data
	//Integer 5 is a object type data
	public static void main(String[] args){
		ArrayList<String> list1 = new ArrayList<String>();
		Scanner sc= new Scanner(System.in);
		String n=sc.next();
		int count=0;
		while(!n.equals("x")){
			list1.add(n);
			count++;
			n=sc.next();
		}
		for(String i:list1){
			System.out.println(i);
		}
	}
}