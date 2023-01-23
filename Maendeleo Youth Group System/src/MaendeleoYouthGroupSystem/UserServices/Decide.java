package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;
import MaendeleoYouthGroupSystem.Registration.WelcomeMenu;

import java.util.Scanner;

public class Decide extends AccountCreationMenu {
    public void decide(){
        String choice;
        System.out.print("\n Do you wish to do another transaction? (Yes/No)"+"\n");
        Scanner scn = new Scanner(System.in);
        choice = scn.next();
        if(choice.equals("yes")){
            NewMemberMenu N = new NewMemberMenu();
            N.displayNemMember();
            N.choicesN();
        }else if(choice.equals("No")){
            LogoutMenu L = new LogoutMenu();
        }else{
            //returns you back to the welcome menu
            WelcomeMenu w = new WelcomeMenu();
            w.display();
            w.options();
        }
    }
}
