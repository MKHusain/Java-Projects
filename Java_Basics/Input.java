package Java_Basics;
// Importing Scanner Library
import java.util.Scanner;

public class Input {
    public static void main(String[] args){
// Creating object of scanner
        Scanner userInput = new Scanner(System.in);
// Creating object from another class.
         LoginSystem login = new LoginSystem();
        String username;
        int password ;
// Reading inputs form user.
        System.out.print("Enter Username: ");
        username = userInput.nextLine();

        System.out.print("Enter Password: ");
        password = userInput.nextInt();


        login.loginCheck(username, password);

        //System.out.println("Username: " + username + "\nPassword: " + password);
    }
}
