
package nestedclass;


public class Computer {
    public class HardDisc{
        public String sayBrand(){
            return "my brand  samsang";
        }
    }
    public static void main(String[] args) {
        Computer c=new Computer();
        Computer.HardDisc hd1=c.new HardDisc();
        //String s1=hd1.sayBrand();
        System.out.println(hd1.sayBrand());
    }
}
