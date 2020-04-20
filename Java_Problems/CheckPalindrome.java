package Java_Problems;

import java.util.*;


public class CheckPalindrome {

    public static void main(String[] args) {
        String start, reverse = "";

        Scanner s1 = new Scanner(System.in);

        System.out.println("Enter your Word: ");

        start = s1.nextLine();

        int length = start.length();

        for (int i = length-1; i >= 0;  i--) {
            reverse = reverse + start.charAt(i);
        }

        if (start.equals(reverse)){
            System.out.println("This is a Palindrome");
        } else {
            System.out.println("This is not a Palindrome");
        }
    }
}
