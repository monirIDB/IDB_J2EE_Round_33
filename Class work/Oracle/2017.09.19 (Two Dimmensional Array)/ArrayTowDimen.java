//Q.tow dimenssional array how to weite and print.
public class ArrayTowDimen{
	public static void main(String[] args){
		int[] p=new int[]{3,1,89};
		int[] q=new int[]{100, 34,56,23,23};
		int[][] x = new int[5][];
		x[0]=p;
		x[1]=q;
		
		
		int[] a=new int[]{1,2,4};
		int[] b=new int[]{4,5,6};
		int[] c=new int[]{9,5,2};
		
		int[][] ar1={a,b,c};
		
		int[][] ar2={
			{1,23,45},
				{23,54,67},
					{34,87,90},
						{34,56,89}
		};
		for(int i=0; i<ar2.length; i++){
		   for(int j=0; j<ar2[i].length; j++){
			System.out.print(ar2[i][j]+" ");
		   }
		   System.out.println("");
		}
		for(int i=0; i<ar1.length; i++){
		   for(int j=0; j<ar1[i].length; j++){
			System.out.print(ar1[i][j]+" ");
		   }
		   System.out.println("");
		}
		
		
	}
}