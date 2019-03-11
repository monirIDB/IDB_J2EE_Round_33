import java.util.Arrays;
public class E1Q8a{
	public static void main(String[] args){
		int[][] a={
			{1,4,45,8,3},
				{6,7,8,9},
					{10,11,12}
		};
		Arrays.sort(a[0]);
		Arrays.sort(a[1]);
		Arrays.sort(a[2]);
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.println(a[i][j]);
			}
		}
	}
}