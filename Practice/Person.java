package Practice;

public class Person {

    //Instance Variable
    String name;
    int age;

    //Class Variable
    static int population = 0;

    public Person(){
        System.out.println("Person Created");
        Person.population += 1;
    }

    public Person(String n, int a){

        name = n;
        age = a;
        population += 1;

        System.out.println("Person "+ name + " Of Age " + age + " Created");

    }

    public void getDetails(){
        System.out.println("Name: "+ name + "\nAge: " + age);
    }

    public static void getPopulation(){
        System.out.println("World Population: " + population);

    }

    public void setDetails(String N, int A){

        name = N;
        age = A;
    }

    public static void main(String[] args) {

        Person P1 = new Person();
        P1.setDetails("Mark ",46);
//        System.out.println(P1.name);
        P1.getDetails();
        Person P2 = new Person("William", 56);
        System.out.println(Person.population);


    }
}
