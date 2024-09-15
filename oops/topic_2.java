//need of default constructor

class BankAccount{
    double balance;
    String accountType;
    //we are not calling to open a account bank will default 100 ruppees. 
    // public BankAccount(){
    //     balance = 100.0;
    // }

    //paramerterized constructor
    public BankAccount(double _balance){
        balance = _balance;
        accountType = "savings";
    }
    public BankAccount(double _balance,String _accountType){
        balance = _balance;
        accountType = _accountType;
    }

    public void printBalance(){
        System.out.println(balance+" "+accountType);
        
    }

   
}


public class topic_2 {
    public static void main(String[] args) {
        BankAccount test = new BankAccount(1000.0);
        test.printBalance(); 
        BankAccount sree = new BankAccount(2000.0,"personal");
        sree.printBalance();
    }
}
