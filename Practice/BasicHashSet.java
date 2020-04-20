package Practice;

import java.util.*;


public class BasicHashSet {
    public static void main(String[] args) {

        studentId();
        studentNames();

    }


    public static void studentId() {

        HashSet<Integer> idNumber = new HashSet<>();

        idNumber.add(20011);
        idNumber.add(20012);
        idNumber.add(20013);
        idNumber.add(20014);
        idNumber.add(20015);
        idNumber.add(20016);
        for (Integer id : idNumber) {
            System.out.println("Student ID: " + id);

        }
    }

        public static void studentNames () {

            HashSet<String> names = new HashSet<>();

            names.add("Eashan");
            names.add("Ferhan");
            names.add("Kawsar");
            names.add("Kamrun");
            names.add("Michael");
            names.add("Shawn");

            for (String n : names) {

                System.out.println("Student Names: " + n);

            }

        }
    }
