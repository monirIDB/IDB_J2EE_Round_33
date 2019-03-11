public class VariableScope01{
	public static int p=10;
	public static int q=20;
	public static void main(String[] args){
		int i=5;
		int j=6;
		int k=i+j;
		System.out.println(k);
	} //Mathod over loading: When two funtion has same name but defferent paremeter
	//then this is called mathod overloading. or A funtion can have same name but perameter
	// should be different, this is called method overloading.
	//class variable: variable out of method is called class variable.
	//local variable: variable which write inside the funtion is called local variable.
	//local variable cannot be access out side of its scope.
	//class variable also called object variable or instancs variable. 
	public static void f1(){
		int i=5;
		int j=6;
	}
	public static void f2(){
		int i=5;
		int j=6;
	}
	public static void f1(int x){
		int i=5;
		int j=6;
	}
}