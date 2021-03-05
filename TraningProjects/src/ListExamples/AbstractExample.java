package ListExamples;
abstract class aex{
	int v=10;
}
public class AbstractExample extends aex {
	int v=20;
	public static void main(String[] args) {
		AbstractExample ae=new AbstractExample();
		aex ae1=new AbstractExample();
		System.out.println(ae.v);
		System.out.println(ae1.v);
		String str="Vigneshiiiii";
		System.out.println(str.replaceFirst("i", "I"));
		System.out.println(str.replaceAll("i","I"));
		System.out.println(str.indexOf("i"));
		System.out.println(str.substring(1));
		System.out.println(str.substring(4,7));
	
	}
	
}
