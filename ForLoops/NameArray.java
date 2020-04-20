package ForLoops;
import com.sun.codemodel.internal.JForEach;

import java.util.Arrays;

public class NameArray {
    public static void main(String[] args) {
        String[] stateName = new String[5];

        stateName[0] = "New York";
        stateName[1] = "New Jersey";
        stateName[2] = "Connitiecut";
        stateName[3] = "Florida";
        stateName[4] = "Michigan";

        for( int x = 0; x<stateName.length; x++){
            System.out.println(stateName[x]);
        }
    }

    }

