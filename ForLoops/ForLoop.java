package ForLoops;

import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

public class ForLoop {
    public static void main(String[] args) {
        System.out.print("These are the multiples of 5: ");
        for(int x =1; x<=100; x++) {

            if(x % 5 == 0) {
                System.out.println(x);
            }

        }

    }
}
