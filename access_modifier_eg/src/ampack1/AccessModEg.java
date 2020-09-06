package ampack1;

public class AccessModEg {
	

	public void helloPublic()
	{
		System.out.println("Hello from public method in class A");
	}
	
	private void helloPrivate()
	{
		System.out.println("Hello from private method in class A");
	}
	protected void helloProtected()
	{
		System.out.println("Hello from protected method in class A");
	}
	void helloDefault()
	{
		System.out.println("Hello from Default method in class A");
	}
	public static void helloStatic()
	{
		System.out.println("Hello from public static method in class A");
	}
	
public void accessPrivate()
		{
			helloPrivate();
		}

}
