package Java_Basics;
// New Class login System
public class LoginSystem {
// Creating a method.
     public static void loginCheck(String uname, int upass) {

         String Username = "Kawsar";
         int Password = 54321;
// Using uname.equals instead of '==' because I am using a String varible.
         if (uname.equals(Username) && upass == Password) {

             System.out.println("Logged in");

         } else {
             System.out.println("Invlaid");
         }

     }

}
