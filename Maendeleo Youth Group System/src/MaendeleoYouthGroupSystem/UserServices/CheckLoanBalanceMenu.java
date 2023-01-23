package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.SupportSystem.TransactionCodeGenerator;

public class CheckLoanBalanceMenu extends AccountCreationMenu {
    public void check_loan_bal(){
        TransactionCodeGenerator t = new TransactionCodeGenerator();
        System.out.print(t.generate()+ "Confirmed that your current balance is "+loan_balance);
        Decide d  = new Decide();
        d.decide();
    }
}
