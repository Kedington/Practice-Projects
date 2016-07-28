public interface Animal {
	
	public void speak(); // Declaration of the speak method in the interface 
	
	public static void main(String[] args) {
		
		Animal spot = new Dog(); // Create Dog Object
		Animal Garfield = new Cat(); // Create Cat Object 
		
		// Calling the methods implemented in the dog and cat class
		System.out.print("A dog goes ");
		spot.speak();
		System.out.print("A cat goes ");
		Garfield.speak();
	}
}
