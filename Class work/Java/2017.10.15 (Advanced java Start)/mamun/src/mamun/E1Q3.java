
package mamun;

public class E1Q3 {
    public static void main(String[] args) {
        int a=1;
        int b=0;
        int sum=0;
        for(int i=0; i<15; i++){
            
            System.out.print(sum+" ");
            sum=a+b;
            a=b;
            b=sum;
        }
    }
}
