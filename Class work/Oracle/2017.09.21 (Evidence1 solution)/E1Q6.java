public class E1Q6{
	public static void main(String[] args){
		int[] a={1,2,3,4,5};
		int b=0;
		for(int i=0; i<5; i++){
			System.out.println(a[i]);
		}
		for (int i=0; i<5; i++){
			b=b+a[i];
		}
		System.out.println("The sum of the arrays number is: "+b);
	}
}