package Practice;

import java.util.*;


public class BasicHashMap {

    public static void main(String[] args) {
        returnDataWithinRange();
    }

    public static Map<Integer, String> zipCodeAndCityNames() {

        Map<Integer, String> storeInfo = new HashMap<>();

        storeInfo.put(11423, "Hollis");
        storeInfo.put(11424, "Jamaica");
        storeInfo.put(11425, "Briwarwood");
        storeInfo.put(11426, "Kew Gardens");
        storeInfo.put(11427, null);

        //System.out.println(storeInfo);
        return storeInfo;
    }

    public static void returnDataWithForeach() {

        Map<Integer, String> dataToRead = zipCodeAndCityNames();

        System.out.println("Retrieving Data with For Each Loop");

        for (Map.Entry<Integer, String> entry : dataToRead.entrySet()) {


            System.out.println("Key: " + entry.getKey());
            System.out.println("Value: " + entry.getValue());
        }

    }

    public static void returnDataWithinRange(){

        Map<Integer, String> readData = zipCodeAndCityNames();

        for ( Map.Entry<Integer, String> entry: readData.entrySet()
             ) {
            if (entry.getKey()>11422 && entry.getKey()<11425){
                System.out.println(entry.getKey());
                System.out.println(entry.getValue());

            }
            
        }

    }
}
