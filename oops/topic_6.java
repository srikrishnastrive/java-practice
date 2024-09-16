abstract class BankManagement {
    double balance;
    abstract void addMoney(double amount);
    abstract void canUserWithdrawMoney(double amount);
    void updateBalance(double _balance){
        balance = _balance;
    }
    public double getBalance(){
        return balance;
    }
}

class SavingsAccount extends BankManagement {
    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(amount <= super.getBalance()){
            System.out.println("User can take money");
        }
        else {
            System.out.println("user cannot take money");

        }
    }

}

class CurrentAccount extends BankManagement {
    double minimumLimit = 1000.0;

    public void addMoney(double amount){
        super.updateBalance(super.getBalance() + amount);
    }

    public void canUserWithdrawMoney(double amount){
        if(super.getBalance() - amount >= minimumLimit){
            System.out.println("User can take money");
        }
        else {
            System.out.println("user cannot take money");

        }
    }
}

public class topic_6 {
    
}
