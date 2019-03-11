
package nestedclass;


public class Test01 {
    public static void main(String[] args) {
        System.out.println(new MyInterfaces01(){
        public String doStudy(){
            return "Student Need Study";
        }
        public String doTravel(){
            return "Student also nedd travel";
        }
    }.doTravel());
    }
}
