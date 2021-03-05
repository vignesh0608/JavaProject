package ListExamples;
import java.util.*;


interface exampleClass{
	class xyz{
		int a=20;
	}
}
class Sa implements exampleClass{
	int x= 10;
	void display(xyz b) {
//		Saa a12=new Saa();
		System.out.println(b.a);
	}
	class Saa{
		
		int y=20;
		public int display() {
			return x;
		}
	}
}
public class ClassMainMethod {
	public static void main(String[] args) {
		Sa sa=new Sa();
		Scanner sc = new Scanner(System.in);
		Sa.Saa saa=sa.new Saa();
//		Sa.xyz xy=new xyz();
		System.out.println(sa.x);
		System.out.println(saa.y);
		System.out.println(saa.display());
		sa.display(new exampleClass.xyz());
//		Sa abc = new exampleClass.xyz();
//		System.out.println(sa.new exampleClass.xyz().a);
		char abcd=  sc.next().charAt(0);
		System.out.println(abcd);
		
	}

}
