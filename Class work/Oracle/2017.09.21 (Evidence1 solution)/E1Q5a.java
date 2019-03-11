import java.util.Arrays;
public class E1Q5a{
	public static void main(String[] args){
		int[] a={6,8,45,3,5};
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}
	}
}