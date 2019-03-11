public class E1Q2{
	public static void main(String[] args){
		int a=7;
		int b=9;
		int c=12;
		if(a<b&c<b){
			System.out.println("Largest number is "+b);
		}else if(a<c){
			System.out.println("Largest number is "+c);
		}else{
			System.out.println("Largest number is "+a);
		}
	}
}
