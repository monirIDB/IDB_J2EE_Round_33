//Casting: Casting is doing anythig by forces. 
public class StaticNonstatic{
	int id;
	String name;
	String book;
	String pc;
	static String pj;
	static String ac;
	static String board;
	public void readBook(){
		System.out.println("Reading book");
	}
	public static void doOnAircon(){
		StaticNonstatic.ac="AC power on done";
	}
	public static void doOnProjector(){
		StaticNonstatic.pj="Projector power on is done";
	}
	StaticNonstatic(){}
	StaticNonstatic(int id, String name){
		
	}
	public static void main(String[] args){
		StaticNonstatic f=new StaticNonstatic(101, "Fatema");
		StaticNonstatic n=new StaticNonstatic(102, "Nasreen");
		StaticNonstatic s=new StaticNonstatic(103, "Sharmin");
		StaticNonstatic a=new StaticNonstatic(104, "Anamul");
		//StaticNonstatic.doOnAircon();
		//System.out.println(StaticNonstatic.ac);
		System.out.println(f.ac);
		System.out.println(n.ac);
	}
}