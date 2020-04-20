package Practice;

import java.util.HashSet;

public class HashSetTest {

    public static void main(String[] args) {

        HashSet<Integer> id = studentId();

        HashSet<String> names = studentNames();

        Object[] idArr = id.toArray();

        Object[] nameArr = names.toArray();

        for (int i = 0; i < idArr.length; i++) {

            System.out.println(idArr[i] + " " + nameArr[i]);

        }

    }


    public static HashSet<Integer> studentId() {

        HashSet<Integer> idNumber = new HashSet<>();

        idNumber.add(20011);
        idNumber.add(20012);
        idNumber.add(20013);
        idNumber.add(20014);
        idNumber.add(20015);
        idNumber.add(20016);
        idNumber.add(20017);

        return idNumber;
    }

    public static HashSet<String> studentNames () {

        HashSet<String> names = new HashSet<>();

        names.add("Eashan");
        names.add("Ferhan");
        names.add("Kawsar");
        names.add("Kamrun");
        names.add("Michael");
        names.add("Navid");
        names.add("Shawn");

        return names;
    }
}
