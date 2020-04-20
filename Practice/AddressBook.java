package Practice;

public class AddressBook {

    String name;
    String address;
    int age;
    long phone;

    public void displayData(){

        System.out.println("Name: " + name +"\nAddress: " +  address +"\nAge: " + age +"\nPhone no: " + phone);

    }

    public void enterData(String pname, String paddress, int page, long pphone){

       name = pname;
       address = paddress;
       age = page;
       phone = pphone;

    }
}

