package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.SupportSystem.TransactionCodeGenerator;

import java.util.Scanner;

public class DepositMenu extends AccountCreationMenu {
    public void deposit(){
        System.out.print("\nEnter the amount you want to deposit: ");
        int amount;
        Scanner sc = new Scanner(System.in);
        amount = sc.nextInt();
        if(amount>0&&amount<=70000){
            balance+=amount;
            TransactionCodeGenerator t = new TransactionCodeGenerator();
            System.out.print(t.generate()+" Confirmed that you deposited "+amount+"\n");
            System.out.print("Your new account balance is: "+balance+"\n");
            Decide d = new Decide();
            d.decide();
        }else{
            System.out.print("The amount should be between 0 and 70000\n");
            System.out.print("Your account balance should not exceed 240000\n");
            deposit();//gives a user another chance
        }
    }
}
