package Practice;
import java.util.Scanner;

public class Calculator {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        boolean calc = true;
        while (calc) {

            System.out.println("Press 1 to do Addition");
            System.out.println("Press 2 to do Subtraction");
            System.out.println("Press 3 to do Multiplications");
            System.out.println("Press 4 to do Division");
            System.out.println("Enter 0 to Exit");

            int sumType;
            System.out.print("Enter your option: ");
            sumType = input.nextInt();

            switch (sumType) {
                case 1:
                    addition();
                    break;
                case 2:
                    subtraction();
                    break;
                case 3:
                    multiplication();
                    break;
                case 4:
                    division();
                    break;
                case 0:
                    calc = false;
                    break;
                default:
                    System.out.println("Invlaid Input");
            }

        }

    }
    public static void addition(){
        System.out.print("Enter the value for x: ");
        double x= input.nextDouble();
        System.out.print("\nEnter the value for y: ");
        double y= input.nextDouble();
        System.out.println(x + y);
    }
    public static void subtraction(){
        System.out.print("Enter the value for x: ");
        double x= input.nextDouble();
        System.out.print("\nEnter the value for y: ");
        double y= input.nextDouble();
        System.out.println(x - y);
    }
    public static void multiplication(){
        System.out.print("Enter the value for x: ");
        double x= input.nextDouble();
        System.out.print("\nEnter the value for y: ");
        double y= input.nextDouble();
        System.out.println(x * y);
    }
    public static void division() {
        System.out.print("Enter the value for x: ");
        double x= input.nextDouble();
        System.out.print("\nEnter the value for y: ");
        double y= input.nextDouble();
        System.out.println(x / y);
    }
}

