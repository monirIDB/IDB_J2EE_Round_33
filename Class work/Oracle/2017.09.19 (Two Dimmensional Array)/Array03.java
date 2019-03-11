//Q.tow dimenssional array how to weite and print.
public class Array03{
	public static void main(String[] args){
		int[][] ar1={
			{1,23,45},
				{23,54,67},
					{34,87,90},
						{34,56,89}
		};
		for(int i=0; i<ar1.length; i++){
		   for(int j=0; j<ar1[i].length; j++){
			System.out.print(ar1[i][j]+" ");
		   }
		   System.out.println("");
		}
		char[][] ar2={
			{'a','b','c','d','e'},
			{'f','g','h','i','j'},
			{'k','l','m','n','o'}
		};
		for(int i=0; i<ar2.length; i++){
		   for(int j=0; j<ar2[i].length; j++){
			System.out.print(ar2[i][j]+" ");
		   }
		   System.out.println("");
		}
		float[][] ar3={
			{1,2,3,4},
			{1,2,3,4},
			{1,2,3,4}
		};
		for(int i=0; i<ar3.length; i++){
		   for(int j=0; j<ar3[i].length; j++){
			System.out.print(ar3[i][j]+" ");
		   }
		   System.out.println("");
		}
		double[][] ar4={
			{1,2,3,4},
			{1,2,3,4},
			{1,2,3,4}
		};
		for(int i=0; i<ar4.length; i++){
		   for(int j=0; j<ar4[i].length; j++){
			System.out.print(ar4[i][j]+" ");
		   }
		   System.out.println("");
		}
		
		
	}
}