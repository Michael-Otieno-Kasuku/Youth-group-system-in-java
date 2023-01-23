package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.UserServices.*;

import java.util.Scanner;

public class NewMemberMenu extends AccountCreationMenu {
    public void displayNemMember(){
        System.out.print("\n\n==============================================\n");
        System.out.print("---------------HOME MENU---------------------------\n");
        System.out.print("====================================================\n\n");
        System.out.print("1. Deposit Money\n");
        System.out.print("2. Borrow Loan\n");
        System.out.print("3. Check Loan Balance\n");
        System.out.print("4. Pay loan\n");
        System.out.print("5. Check balance\n");
        System.out.print("6. Log out\n\n");
    }

    public void choicesN(){
        int choice;
        System.out.print("Enter your choice: ");
        Scanner sc = new Scanner(System.in);
        choice = sc.nextInt();

        switch (choice){
            case 1:
                DepositMenu d = new DepositMenu();
                d.deposit();
                break;
            case 2:
                LoanBorrowingMenu L = new LoanBorrowingMenu();
                L.display_borrow();
                L.choices();
                break;
            case 3:
                CheckLoanBalanceMenu c = new CheckLoanBalanceMenu();
                c.check_loan_bal();
                break;
            case 4:
                PayLoanMenu p = new PayLoanMenu();
                p.pay_loan();
                break;
            case 5:
                CheckBalanceMenu ck = new CheckBalanceMenu();
                ck.check_bal();
                break;
            case 6:
                LogoutMenu Lo = new LogoutMenu();
                Lo.logout();
                break;
            default:
                System.out.print("Kindly choose from this choices below\n");
                displayNemMember();
        }
    }
}
