
package createwindow;


public class AccMain {
    public static void main(String[] args) {
        Account acc1=new Account(101,"Anis","Saving","Farmget", "12-10-2013",345);
        AccMain am=new AccMain();
        AccSave as=new AccSave();
       boolean b=as.createDB();
       if(b){
           System.out.println("Data Saved");
       }else{
           System.out.println("Data Not Saved");
       }
       boolean c=as.createTable();
       if(c){
           System.out.println("Data Saved");
       }else{
           System.out.println("Data Not Saved");
       }
    }
}
