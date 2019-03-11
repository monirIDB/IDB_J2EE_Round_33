
package mamun;


public class E1Q1 {
  public static void main(String[] args) {
        int[][] ar=new int[3][];
        int[] a1={1,2,3,4,77};
        int[] a2={5,6,7,8};
        int[] a3={9,10,11,12,99,100};
         ar[0]=a1;
         ar[1]=a2;
         ar[2]=a3;
         for(int i=ar.length-1;i>=0;i--){
             for(int j=ar[i].length-1; j>=0; j--){
                 System.out.print(ar[i][j]+" ");
             }
             System.out.println(" ");
         }
    }  
}
