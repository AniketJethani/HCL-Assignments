package Assignment1;

import java.util.Scanner;

public class UseBankManagement {
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        BankManagement obj=new BankManagement("Aniket",123456789);
        obj.deposit(10000,"Aniket",123456789);
        obj.withdrawl(20000);
        obj.withdrawl(10000);
        obj.balanceEnquiry();
        System.out.println(obj.accDetails());

    }
}
