package Practice;


public class ConstructorObject {
	
	public ConstructorObject() {
		System.out.println("Object of Class Contstruct Objetc Created");
		
	}
	
	public ConstructorObject(String name , int x) {
		System.out.println("Object of Class Contstruct Objetc Created " + name + " " +  x);

	}
	
	public static void main(String[] args) {
		
		ConstructorObject obj1 = new ConstructorObject();
		
		ConstructorObject obj2 = new ConstructorObject("JOHN", 45);
		
		
	}
	

}
