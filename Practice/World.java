package Practice;

public class World {

    public static void main(String[] args) {

        Person P1 = new Person();
        P1.setDetails("Mark ",46);
        System.out.println(P1.name);
        P1.getDetails();
        Person P2 = new Person("William", 56);
        System.out.println(Person.population);

        Person.getPopulation();


    }

}
