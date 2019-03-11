
package mamun;


public class Fibonacci {
    public static void main(String[] args) {
     int a=1;

     int b=0;

     int n=0;


     for(int i=1; i<16; i++){
       
       n=a+b;
       a=b;
       b=n;
        System.out.println(n);
      }
    }
}
