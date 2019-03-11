public class Probelem{
	static int e;
	public static void main(String[] args){
			int [][] ar2={
			{2,6,4},
			{21,31,45,78},
			{5,40,8}
		};
		int b=0;
		int c1=0;
		int c2=0;
		for(int i=0;i<1;i++){
			for(int j=0;j<ar2[i].length;j++){
				//b=b+ar2[i][j];
				//System.out.print(ar2[i][j]+" ");
				c1=c1+ar2[i][j];
			    //c2=c2+ar2[1][j];
			}
			
			System.out.println();
			//System.out.println("Total value="+b);
		}
		for(int i=1;i<2;i++){
			for(int j=0;j<ar2[i].length;j++){
				//b=b+ar2[i][j];
				//System.out.print(ar2[i][j]+" ");
				//c1=c1+ar2[0][j];
			    c2=c2+ar2[i][j];
			}
			
			System.out.println();
			//System.out.println("Total value="+b);
		}
		System.out.println("Total value="+b);
		System.out.println("Total value="+c1);
		System.out.println("Total value="+c2);
		e=c2-c1;
		System.out.println("summation value="+e);
	}
	
}