
package dbsetergetter;

import java.util.*;


public class SetExample {
    public static void main(String[] args) {
        Set set = new HashSet();
        
       set.add("on");
        set.add("cond");
        set.add("rd");
        set.add(new Long(5));
        set.add(new Integer(4));
        set.add(new Integer(3));
        set.add(new Double(2.0));
        set.add(new Float(5.0F));
        set.add(new Float(4.0F));
        
        set.add("second");
         set.add(new Integer(4));
         System.out.println(set);
    }
}
