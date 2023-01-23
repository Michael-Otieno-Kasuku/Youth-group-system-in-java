package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.SupportSystem.TransactionCodeGenerator;

public class CheckBalanceMenu extends AccountCreationMenu {
    public void check_bal(){
        TransactionCodeGenerator t = new TransactionCodeGenerator();
        System.out.print(t.generate()+ " Confirmed that your current account valance is "+balance);
        Decide d = new Decide();
        d.decide();
    }
}
