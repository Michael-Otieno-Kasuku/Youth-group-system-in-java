package MaendeleoYouthGroupSystem.Registration;

import MaendeleoYouthGroupSystem.UserServices.NewMemberMenu;
import MaendeleoYouthGroupSystem.UserServices.LogInMenu;

import java.util.Scanner;

public class WelcomeMenu extends AccountCreationMenu {
    public void display(){
        System.out.print("*****************************************************************\n");
        System.out.print("-------------MAENDELEO YOUTH GROUP SYSTEM------------------------\n");
        System.out.print("*****************************************************************\n\n");
        System.out.print("------------------DEVELOPER--------------------------------------\n");
        System.out.print("---------------MICHAEL OTIENO KASUKU-----------------------------\n");
        System.out.print("*****MASINDE MULIRO UNIVERSITY OF SCIENCE AND TECHNOLOGY**********\n\n");
        System.out.print("==================================================================\n");
        System.out.print("-----------------WELCOME MENU-------------------------------------\n");
        System.out.print("===================================================================\n\n");
        System.out.print("1. NEW MEMBER\n");
        System.out.print("2. ALREADY A MEMBER\n");
        System.out.print("3. EXIT\n\n");
    }
    public void options(){
        int choice;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                //create a new account
                AccountCreationMenu A = new AccountCreationMenu();
                A.setFirst_name();
                A.setLast_name();
                A.setYearOfBirth();
                A.setID_number();
                A.setPhone_number();
                A.setPassword();
                A.getAge();
                A.finishCreatingAccount();
                display();
                options();
                break;
            case 2:
                //Log in to your existing account
                LogInMenu L = new LogInMenu();
                L.verify();
                //Take the user to the home menu now
                NewMemberMenu N = new NewMemberMenu();
                N.displayNemMember();
                N.choicesN();//home menu
                break;
            case 3:
                //Exit the program
                System.out.close();
                break;
            default:
                System.out.print("\nPlease make a choice that is in this list");
                display();//takes you back to the home screen
                break;
        }
    }
}
