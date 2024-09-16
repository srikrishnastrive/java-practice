//encapsuilation



//need of default constructor

class BankAccount1{
    private double balance;
    private String accountType;
    //we are not calling to open a account bank will default 100 ruppees. 
    // public BankAccount(){
    //     balance = 100.0;
    // }

    //paramerterized constructor
    public BankAccount1(double balance){
        this.balance = balance;
        this.accountType = "savings";
    }
    public BankAccount1(double _balance,String _accountType){
        this.balance = _balance;
        this.accountType = _accountType;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance(){
        return this.balance;
    }

    public void printBalance(){
        System.out.println(balance+" "+accountType);
        
    }

    

   
}


public class topic_3 {
    public static void main(String[] args) {
        BankAccount1 test = new BankAccount1(1000.0);
        test.setBalance(50);
        System.out.println(test.getBalance());
        test.printBalance();
      
       
    }
}
