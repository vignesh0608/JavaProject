package Taks;
abstract class Exmp{
	public void display() {
		System.out.println("Hellow World");
	}
}
public class LiveExamples extends Exmp {
	public void display() {
		System.out.println("Hello");
		super.display();
	}
	public static void main(String[] args) {
		Exmp ex=new LiveExamples();
		ex.display();
		System.out.println(" String".trim() + "String");
		if(" String".trim() == "String")
			System.out.println("Equal"); 
		else
			System.out.println("Not Equal");
		}
	
	
}
