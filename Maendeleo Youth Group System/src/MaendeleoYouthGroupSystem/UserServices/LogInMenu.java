package MaendeleoYouthGroupSystem.UserServices;

import MaendeleoYouthGroupSystem.Registration.AccountCreationMenu;

import java.util.Scanner;

public class LogInMenu extends AccountCreationMenu {
    public void verify(){
        String Fname;
        long Password;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        Password = sc.nextInt();
        System.out.print("\nEnter your First name: ");
        Fname = sc.next();
        /*if(Fname.equals(First_name)&&password==Password){
            System.out.print("\nWelcome "+Fname);
        }else {
            verify();
        } Shall be updated later*/
    }

    public void close(){
        System.out.print("\nThank you for being part of us.");
        System.out.close();
    }
}
