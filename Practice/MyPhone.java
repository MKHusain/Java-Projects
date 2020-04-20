package Practice;
import java.util.Scanner;


public class MyPhone {
    public static void main(String[] args) {

       AddressBook contacts = new AddressBook();
       contacts.enterData("Kawsar","123 Ave New York",26, 987_654_321);

       contacts.displayData();

    }
}
