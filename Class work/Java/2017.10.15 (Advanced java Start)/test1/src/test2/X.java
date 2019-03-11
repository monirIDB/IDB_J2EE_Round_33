
package test2;

public class X {

    private static int a = 3;

    public static void main(String[] args) {
        modify(a);
        System.out.println(a);
    }

    public static void modify(int a) {
        ++a;
        System.out.println(a);
         modify(a);
         
    }
}








