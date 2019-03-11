//E1Q12. Create an Array which has five value and display it's value ascending or descending order.


import java.util.Arrays;
public class E1Q12{
	public static void main(String[] args){
		int[] a={6,8,45,3,5};
		Arrays.sort(a);
		int[] b=new int[5];
		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}
	}
}