public class E1Q7{
	public static void main(String[] args){
		int[][] a={
			{1,2,3,4,5},
				{6,7,8,9},
					{10,11,12}
		};
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