package Practice;

import java.util.*;


public class ArrayListDemo {

    public static void main(String[] args) {

        ArrayListDemo obj = new ArrayListDemo();

        //obj.storeStudentInfoInArray();
        obj.storeStudentNamesInArrayList();


    }

    public void storeStudentInfoInArray(){

        // Creating a Method for Student Locations in Array.

        String[] studentLocation = new String[3];

        studentLocation[0] = "Queens";
        studentLocation[1] = "Bronx";
        studentLocation[2] = "Brooklyn";

        for ( String str : studentLocation){
            System.out.println("Student Location are " + str);

        }
    }

    public void storeStudentNamesInArrayList(){

        // Creating a method for Student Names in ArrayList

        List<String> studentNames = new ArrayList<>();

        studentNames.add("Mathew");
        studentNames.add("Johnson");
        studentNames.add("Jack");
        studentNames.add("Chad");

        // Some of the Wayy to call ArrayList

        System.out.println("Names of Student: " + studentNames); // Printing Names in a Set

        // Print the Length of Arraylist

        System.out.println(studentNames.size());

        for (String str : studentNames) {

            System.out.println(str);
        }
         for (int i = 0; i<studentNames.size(); i++ ){

             System.out.println(studentNames.get(i));
         }


        }




    }

