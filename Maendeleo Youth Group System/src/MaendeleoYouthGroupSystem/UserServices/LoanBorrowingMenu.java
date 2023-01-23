package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Loans.EmergencyLoan;
import MaendeleoYouthGroupSystem.Loans.LongTermLoan;
import MaendeleoYouthGroupSystem.Loans.ShortLoan;
import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;

import java.nio.channels.AcceptPendingException;
import java.util.Scanner;

public class LoanBorrowingMenu extends AccountCreationMenu {
    public void display_borrow(){
        System.out.print("=========================================================\n");
        System.out.print("-----------------------LOANS MENU-------------------------\n");
        System.out.print("============================================================\n\n");
        System.out.print("1. Emergency Loan\n");
        System.out.print("2. Short Loan\n");
        System.out.print("3. Long term Loan\n\n");
    }

    public void choices(){
        int choice;
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch(choice){
            case 1:
                EmergencyLoan e = new EmergencyLoan();
                e.EmergencyLoan();
                break;
            case 2:
                ShortLoan s = new ShortLoan();
                s.ShortLoan();
                break;
            case 3:
                LongTermLoan l = new LongTermLoan();
                l.LongTermLoan();
                break;
            default:
                Decide d = new Decide();
                d.decide();
                break;
        }
    }
}
