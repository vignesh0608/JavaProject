package Taks;

public class StringMethods {
	StringMethods(String name){
		String name1=name;
	}

	public static void main(String[] args) {
		StringMethods smd=new StringMethods("Hello");
		StringMethods smd1=new StringMethods("Hellow");
		System.out.println(smd=smd1);
		String name="Vignesh Vijayakumar";
		String name1="Vignesh Vijayakumar";
		String name2="vignesh Vijayakumar";
		String secondName="Sowmini Srinivasan";
		String thirdName="Kathireshan";
		System.out.println(name.concat(secondName));
		System.out.println(name.equals(thirdName));
		System.out.println(name.equals(name1));
		System.out.println(name==name1);
		System.out.println(name.equalsIgnoreCase(name2));
		System.out.println(name.endsWith("r"));
		System.out.println(name.startsWith("Vig"));
		System.out.println(name.contains("Vignesh"));
		System.out.println(name.charAt(4));
		System.out.println(name.compareTo(name1));
		System.out.println(name.indexOf('V',1));
		System.out.println(name.lastIndexOf('z'));
		System.out.println(secondName.replace("Srinivasan", "Vignesh"));
		//System.out.println(secondName.replace)
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.length());
		String[] splitExample=name.split(" ");
		for(String i:splitExample) {
			System.out.println(i);
		}
		System.out.println(name.substring(8));
		System.out.println(name.substring(8,13));
		
//		char[] charExample=name.toCharArray();
//		for(char i :charExample) {
//			System.out.println(i);
//		}
//		String abc="    Hai    ";
//		System.out.println(abc);
//		
//		System.out.println(abc.trim());
//		byte i=3; ;; if(i!=3);
//		System.out.println(i);

	}
	
	
	
	
}
