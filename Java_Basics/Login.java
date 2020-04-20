package Java_Basics;

public class Login {


  public static void main(String[] args) {

      String u_name = "kawsar";
      int password = 654321;

      String u_input = "";
      int p_pass = 0;

      if (u_input == u_name && p_pass == password) {

          System.out.println("You're logged in.");

      } else {
          System.out.println("Invalid user or password.");
      }
  }
  }
