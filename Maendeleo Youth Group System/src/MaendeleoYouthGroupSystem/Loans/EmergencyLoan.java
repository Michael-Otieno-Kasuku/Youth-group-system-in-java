package MaendeleoYouthGroupSystem.Loans;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.SupportSystem.TransactionCodeGenerator;
import MaendeleoYouthGroupSystem.UserServices.Decide;

import java.util.Scanner;

public class EmergencyLoan extends AccountCreationMenu {
    public void EmergencyLoan(){
        int amount;
        System.out.print("Enter the amount you want to borrow: ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        if(amount <=balance){
            loan_borrowed = amount;
            balance += loan_borrowed;
            TransactionCodeGenerator t = new TransactionCodeGenerator();
            System.out.print(t.generate()+" Confirmed you have borrowed "+loan_borrowed+"\n");
            System.out.print("Your new account balance is "+balance+"\n");
            System.out.print("\nThank your for using Maendeleo services\n.");
            Decide d = new Decide();
            d.decide();
        }else{
            System.out.print("The maximum loan you can get is "+balance+"\n");
            System.out.print("\nPlease try again! \n");
            EmergencyLoan();//recursive call
        }
    }
}
