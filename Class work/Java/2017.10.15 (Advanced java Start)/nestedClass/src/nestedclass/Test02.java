
package nestedclass;


public class Test02 {
    public static void main(String[] args) {
        Student s1=new Student(){
           public String doStudy(){
               return "Student need study";
           }
           public String doTravel(){
               return "Stuent also need travel";
           }
        };
        System.out.println(s1.doStudy());
    }
    
}
