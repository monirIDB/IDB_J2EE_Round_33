public class StudentTest{
	public static void main(String[] args){
		Student s1=new Student (1001,"Karim ");
		System.out.println(s1.id);
		System.out.println(s1.name);
		System.out.println(s1.f1());
		System.out.println(s1.f2());
		s1.f3();
		System.out.println(s1.name);
		
	}
}