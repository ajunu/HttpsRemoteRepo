package mypack;

public class MyJavaClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("helloooo");

//implicit casting
int x =100;
float f = x;

System.out.println("int value:" + f);

//explicit casting 
float f1 =100.01f;
int i = (int) f1;
System.out.println("int to float value:" + i);

//implicit casting 
char c = 'a';
int n = c;

System.out.println("int to float value:" + n);   // output is 97

//explicit casting int to char

int y = 97;
char c1 = (char) y;
System.out.println("int to char value:" + c1);

	}

}
