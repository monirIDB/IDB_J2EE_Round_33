
package createwindow;


public class Account {
    int id;
    String name;
    String type;
    String branch;
    String date;
    double balance;

    public Account() {
    }

    public Account(int id, String name, String type, String branch, String date, double balance) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.branch = branch;
        this.date = date;
        this.balance = balance;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getBranch() {
        return branch;
    }

    public void setBranch(String branch) {
        this.branch = branch;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
