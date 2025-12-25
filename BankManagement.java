package Assignment1;

public class BankManagement {
    int balance;
    String accHolder;
    int accountNumber;
    public BankManagement(String accHolder,int accountNumber){
        this.accHolder=accHolder;
        this.accountNumber=accountNumber;
        this.balance=0;

    }


    public void deposit(int amount,String accHolder,int accountNumber){
        if(this.accHolder.equals(accHolder) && this.accountNumber==accountNumber)
               balance+=amount;
        else
            System.out.println("Wrong Account details! Suspicious activity detected");
    }

    public void withdrawl(int amount){
        if(balance>0 && balance>=amount){
            balance-=amount;
        }
       else{
            System.out.println("Insufficient Balance");
        }
    }
    public void balanceEnquiry(){
        System.out.println("Current balance is "+balance);
    }

    public String accDetails(){
        return "Account Holder is "+this.accHolder+", and his/her account number is "+ this.accountNumber+",and current balance is "+this.balance;
    }




}
