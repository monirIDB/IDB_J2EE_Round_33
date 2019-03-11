import java.util.Arrays;
public class E1Q6b{
	public static void main(String[] args){
		int[] a={4,8,1,2,6};
		int b=0;
		Arrays.sort(a);
		for(int i=a.length-1; i>=0; i--){
			System.out.println(a[i]);
		}
		
		for (int i=0; i<5; i++){
			b=b+a[i];
		}
		System.out.println("The sum of the arrays number is: "+b);
	}
}