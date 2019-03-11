//Q. Write array with different type of primative data and print them with for loop.

public class Array02{
	static int[] a={2,3,4,7,8};
	static double[] b={45,45,676,334,3432};
	static float[] c={1223,1234,2234,5454,12234};
	static char[] d={'a','b', 'c', 'd', 'f'};
	static short[] e={1,2,3,4,5};
	static long[] f={1,2,3,4,5};
	static byte[] g={1,2,3,4,5};
	static boolean[] h={true,true,true,false,false};
	public static void main(String[] args){
		for(int i=0; i<a.length; i++){
			System.out.print(a[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<b.length; i++){
			System.out.print(b[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(c[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(d[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(e[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(f[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(g[i]+" ");
		}
		System.out.println(" ");
		for(int i=0; i<a.length; i++){
			System.out.print(h[i]+" ");
		}
	}
}