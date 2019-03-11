//static method can not call non static method directly and non static method can not call static mehtod.

public class TestArray{
	static int i;
	static int[] ar=new int[5];
	public static void main(String[] args){
		ar[0]=10;
		ar[1]=13;
		ar[2]=14;
		ar[3]=12;
		ar[4]=18;
		System.out.println(ar[0]+" "+ar[1]+" "+ar[2]+" "+ar[3]+" "+ar[4]);
	}
}