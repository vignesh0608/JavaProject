package Taks;

class A{
	final int a=234;
	A(){}
	A(String name){
		System.out.print(name);
	}
}
class B extends A{
	B(){
		
	}
	B(String name){
		super("Vignesh ");
		System.out.print(name);
	}
	void display() {
		System.out.println("Called by Super Keyword");
	}
}
class S extends B{
//	void display() {
//		this();
//	}
	S(){
		System.out.println("Haii");
		super.display();
	}
	S(String name){
		this();
		
		System.out.println(name);
		super.display();
		System.out.print(a);
		
	}

	public static void main(String[] args) {
		S ss=new S();
		S s=new S("kumar");
	}
}

//class S{
//static void test()throws RuntimeException{
//try {
//	System.out.print("test ");
//throw new RuntimeException();
//} 
//catch (Exception ex) {
//	System.out.print("exception "); }
//} 
//public static void main(String[] args) {
//try {
//	test(); 
//	} 
//catch (RuntimeException ex) { 
//	System.out.print("runtime ");
//	} System.out.print("end"); }
//	static void test() {
//		try {
//		String x = null;
//		System.out.print(x.toString() + " ");
//		}
//		finally { 
//			System.out.print("finally ");
//			}
//		}
//		
//		public static void main(String[] args) {
//		try { test(); }
//		catch (Exception ex) { 
//			System.out.println(ex);
//			System.out.print("exception "); }
//
//}
//	class S{ 
//		private void display(){
//		System.out.println("Display()");
//		}
//		private static void show() {
//			display();
//		System.out.println("show()");
//		}
//		public static void main(String args[]){
//		show();
//		}
//		}
