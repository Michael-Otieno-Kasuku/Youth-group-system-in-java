package MaendeleoYouthGroupSystem.Loans;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.SupportSystem.TransactionCodeGenerator;
import MaendeleoYouthGroupSystem.UserServices.Decide;

import java.util.Scanner;

public class LongTermLoan extends AccountCreationMenu {
    public void LongTermLoan(){
        int amount;
        System.out.print("Enter the amount you want to borrow: ");
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        if(amount <=balance*3 ){
            loan_borrowed = amount;
            balance += loan_borrowed;
            TransactionCodeGenerator t = new TransactionCodeGenerator();
            System.out.print(t.generate()+" Confirmed you have borrowed "+loan_borrowed+"\n");
            System.out.print("Your new account balance is "+balance+"\n");
            System.out.print("\nThank your for using maendeleo services\n.");
            Decide d = new Decide();
            d.decide();
        }else{
            System.out.print("The maximum loan you can get is "+balance*3+"\n");
            System.out.print("\nPlease try again! \n");
            LongTermLoan();//recursive call
        }
    }
}
