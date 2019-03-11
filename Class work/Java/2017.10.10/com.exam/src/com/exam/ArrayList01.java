
package com.exam;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;


public class ArrayList01 {
    public static void main(String[] args) {
       List al= new ArrayList();
       al.add("Polas");
       al.add("Nasrin");
       al.add("Sharmin");
       al.add("Fatema");
       
       al.add("Rahim");
       al.add("Anis");
       al.add("Mamun");
       al.add("Murad");
       al.add("Asraf");
       
       al.add("Sibli");
       al.add("Al Amin");
       al.add("Monir");
       //loop by iterator
       Iterator it= al.iterator();
       while(it.hasNext()){
           System.out.print(it.next()+" ");
       }
       System.out.println();
       for(int i=0; i<al.size(); i++){
           System.out.print(al.get(i)+" ");
       }
       System.out.println();
       //loop by for
       Object[] ol=al.toArray();
       
       for(int i=0; i<ol.length; i++){
           System.out.print(ol[i]+" ");
       }
       //loop by enhanced for
       System.out.println();
       for(Object s: al){
           System.out.print(s+" ");
       }
       
       /*System.out.println(al.get(4));
       System.out.println(al.isEmpty());
       System.out.println(al.get(4));
       System.out.println(al.contains(6));
       System.out.println(al.indexOf("Anis"));*/
       
       //al.clear();
      // System.out.println(al);
    }
}
