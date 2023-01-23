package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.SupportSystem.TransactionCodeGenerator;

import java.util.Scanner;

public class PayLoanMenu extends AccountCreationMenu {
    public void pay_loan(){
        int amount;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        System.out.print("Enter the amount you want to deposit: ");
            if((loan_balance-amount)>0&&(loan_balance-amount)<=loan_balance){
                loan_balance -=amount;
                TransactionCodeGenerator t =  new TransactionCodeGenerator();
                System.out.print(t.generate()+" Confirmed you payed "+ amount+"\n");
                System.out.print("Your new loan balance is "+loan_balance);
            }else{
                System.out.print("\nSorry try again\n");
                Decide d = new Decide();
                d.decide();
        }
    }
}
