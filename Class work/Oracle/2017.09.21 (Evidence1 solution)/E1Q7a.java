import java.util.Arrays;
public class E1Q7a{
	public static void main(String[] args){
		int[][] a={
			{1,2,98,34,11},
				{6,45,67,89},
					{1,55,4}
		};
		Arrays.sort(a[0]);
		Arrays.sort(a[1]);
		Arrays.sort(a[2]);
		int b=0;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.println(a[i][j]);
			}
		}
		for (int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				b=b+a[i][j];
			}
		}
		System.out.println("The sum of the arrays number is: "+b);
	}
}