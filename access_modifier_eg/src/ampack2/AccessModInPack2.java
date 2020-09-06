package ampack2;
import ampack1.AccessModEg;
public class AccessModInPack2 {

	public static void main(String[] args) {
		
		AccessModEg a = new AccessModEg();
		
		//a.helloPrivate();  // not possible
		a.accessPrivate();
		
		a.helloPublic();
		
		//a.helloProtected(); // private and protected not possible to acess outside class and inside another package respectively 
		
		AccessModEg.helloStatic();

	}

}
