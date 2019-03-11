public class MyTranction{
	public static void main(String[] args){
		Account myAcct;
		myAcct=new Account("me");
		myAcct.balance=200.0;
		myAcct.deposit(300.0);
		myAcct.withdraw(100.0);
		double myBalance;
		myBalance=myAcct.getBalance();
		System.out.println(myBalance);
	}
}