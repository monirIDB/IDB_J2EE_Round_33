package anisvai;
public class MyTranction1{
	public static void main(String[] args){
		Account myAcct;
                Account myChildAcct;
		myAcct=myChildAcct;
		myAcct=new Account("Anis");
	    
		//myChildAcct=myAcct;//-- variable is  initialised mychildAcct--
		//-- variable is not initialised mychildAcct--
		myChildAcct=new Account("child");
                //myAcct=myChildAcct;
		myChildAcct.balance=200.0;
		myChildAcct.deposit(500.0);
		
		
		myChildAcct.withdraw(100.0);
		//myAcct=myChildAcct;
		double myBalance;
		myBalance=myAcct.getBalance();
		System.out.println(myBalance);
		   String Customer;
		  Customer=myAcct.getCustomer();
		  System.out.println(Customer);
	}
}