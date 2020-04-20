package Practice;

public class NumSorter {
    public static void main(String[] args) {
        int[] evenNumber = new int[50];
        int[] oddNumber = new int[50];
        int evencounter = 0;
        int oddcounter =0;

        for(int x =1; x<=100; x++) {
            if(x % 2 == 0) {
                evenNumber[evencounter] = x;
                evencounter++;
            }else {
                oddNumber[oddcounter] = x;
                oddcounter++;
            }
        }

        System.out.print("Even Numbers: ");
        for (int y :evenNumber) {
            System.out.print(y + " ");

        }

        System.out.print("\nOdd Numbers: ");
        for (int z :oddNumber) {
            System.out.print(z + " ");
        }

    }
}
