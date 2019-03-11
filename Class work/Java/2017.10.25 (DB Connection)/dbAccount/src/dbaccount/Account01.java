
package dbaccount;


public class Account01 {
    int accNo;
    String accName;
    String accType;
    String branch;
    String openingDate;
    double balance;

    public Account01() {
    }

    public Account01(int accNo) {
        this.accNo = accNo;
    }

    public Account01(int accNo, String accName, String accType, String branch, String openingDate, double balance) {
        this.accNo = accNo;
        this.accName = accName;
        this.accType = accType;
        this.branch = branch;
        this.openingDate = openingDate;
        this.balance = balance;
    }

    public int getAccNo() {
        return accNo;
    }

    public void setAccNo(int accNo) {
        this.accNo = accNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getAccType() {
        return accType;
    }

    public void setAccType(String accType) {
        this.accType = accType;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getOpeningDate() {
        return openingDate;
    }

    public void setOpeningDate(String openingDate) {
        this.openingDate = openingDate;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return " "  + accNo + " "  + accName + " "  + accType + " "  + branch + " "  + openingDate + " "  + balance ;
    }
    
}
