package Java_Basics;
//Creating a Temperature Converter
// Imported Decimal Formating to choose number of decimal places
import java.text.DecimalFormat;
// Imported Scanner to take user input
import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat("##.#");
        Scanner input = new Scanner(System.in);

        System.out.println("Enter 1 to Convert •C to •F ");
        System.out.println("Enter 2 to Convert •F to •C");

        int option;
        System.out.print("Enter your Converter: ");
        option = input.nextInt();

        double result = 0;

        if (option == 1) {
            result = convertCtoF();
            System.out.println(df.format(result));

        } else if (option == 2){
            result = converFtoC();
            System.out.println(df.format(result));

        }else {
            System.out.println("Invlaid Input");
        }


    }

    public static double convertCtoF() {
        Scanner input = new Scanner(System.in);
        double faren = 0;
        System.out.print("Please enter celsius: ");
        double celsius = input.nextDouble();
        faren = (celsius * 9/5) + 32;
        return faren;
    }


    public static double converFtoC() {
        Scanner input = new Scanner(System.in);
        double celsius = 0;
        System.out.print("Please enter Fhareneit: ");
        double fhareneit = input.nextDouble();
        celsius = (fhareneit - 32 ) * 5/9;
        return celsius;
    }

}
