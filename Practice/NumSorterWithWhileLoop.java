package Practice;

public class NumSorterWithWhileLoop {
    public static void main(String[] args) {
        int[] evenNumber = new int[50];
        int[] oddNumber = new int[50];
        int evencounter = 0;
        int oddcounter = 0;

        int count =1;

        while (count <= 100 ) {
            if(count % 2 == 0){
                evenNumber[evencounter] = count;
                evencounter++;

            }else {
                oddNumber[oddcounter] = count;
                oddcounter++;
            }
            count++;
        }
        System.out.print("Even Numbers: ");
        int counter = 0;
        while(counter < evenNumber.length){
            System.out.print(evenNumber[counter] + " ");
            counter++;
        }
        System.out.print("\nOdd Numbers: ");
        int counter2 = 0;
        while (counter2 < oddNumber.length){
            System.out.print(oddNumber[counter2] + " ");
            counter2++;
        }

    }
}
