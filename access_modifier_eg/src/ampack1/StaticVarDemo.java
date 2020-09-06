package ampack1;

public class StaticVarDemo {
	int x;
	int y;
	static int z;
	
	public static void main(String[] args) {
		
		StaticVarDemo d1 = new StaticVarDemo();
		d1.x = 100;
		d1.y = 200;
		z = 5000 ; // static variable doesn't need object
		d1.printValues();
		
		StaticVarDemo d2 = new StaticVarDemo();
		d2.printValues();  // here x and y value will be zero but for static variable Z will be shared value from above
		
	
	}
	
	public void printValues()
		{
		System.out.println("x =" +x);
		System.out.println("y =" +y);
		System.out.println("z =" +z);
		}
}
