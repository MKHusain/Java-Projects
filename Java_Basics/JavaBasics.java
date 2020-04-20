package Java_Basics;

public class JavaBasics {


        //Premitive Data Types
        byte a = 126;  // Range (-128, 127)
        short b = 32000; // Range (-32K, 32K)
        int c = 2_000_000_000; // Range (-2B, 2B)
        long d = 1_000_000_000_000L; // Range ( 9,223,372,036,854,775,808 to 9,223,372,036,854,775,807)
        float e = 10.5f; // Range ±3.40282347E+38F(6-7 significant decimal digits)
        double f = 20.99; // Range (±1.79769313486231570E+308(15 significant decimal digits)
        char g = 'A'; // Range (0 to 65,536 (unsigned))
        boolean h = true;

        // For the "Variable" We can enter the Variable name to be printed.
        // We can also use Arithmetic expressions for the variables.
        public static void sayHello() {
            String name = "JavaBasics";
            System.out.println("Hello From " + name);
        }
}
