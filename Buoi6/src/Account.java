import java.time.LocalDate;
import java.util.Date;

public class Account {
    private int id;
    private double balance;
    private double annualInterestRate;
    private  LocalDate dateCreated;

    public Account(){
        this.balance = 0.0;
        this.annualInterestRate = 0.0;
        this.dateCreated = LocalDate.now();

    }
    
    public Account(int id, double balance) {
        this.id = id;
        this.balance = balance;
    }

    public Account(int id, double balance , double annualInterestRate ) {
        this.id = id;
        this.dateCreated = LocalDate.now();
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
    }


    public double getMonthlyInterestRate() {
        return this.annualInterestRate/(12*100);
    }

    public double getMonthlyInterest() {
        return this.balance*this.getMonthlyInterestRate();
    }
    public void withdraw(double amount) {
        this.balance -= amount;
    }
    public void deposit(double amount) {
        this.balance += amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public LocalDate getDateCreated() {
        return dateCreated;
    }

}
