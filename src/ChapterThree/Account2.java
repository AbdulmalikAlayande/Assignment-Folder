package ChapterThree;

public class Account2 {

    private String name;
    private double balance;

    public Account2(){}

    public Account2(String name, double balance){
        this.name = name;
        this.balance = balance;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        balance-=amount;
    }
    public double getBalance(){
        return balance;
    }
}
