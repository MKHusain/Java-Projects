package Java_Basics;

public class Oddnum {
    public static void main(String[] args) {

        int count = 0;
//Using while loops and If condition to show the odd number from 0 to 45
        while( count <46) {

            if(count % 2 != 0 ) {
                System.out.println(count);
            }
            count++;
        }
    }
}
