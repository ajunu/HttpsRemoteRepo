package ampack1;

public class AccessModMain {
	public static void main(String[] args) {
		
		AccessModEg a = new AccessModEg();
		
		a.helloDefault();
		
		a.helloProtected(); // Accessable in the same package
		
		a.helloPublic();
		
		AccessModEg.helloStatic();    // Static method can be called using class name , without object
		
		
		//a.helloPrivate(); not possible to access outside the class
		a.accessPrivate();  // accesssed with the help of public method calling private function
	
	}

}
