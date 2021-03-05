package ListExamples;

//public class MyString {
//
//}

public class MyString { String str = "All that we are is the result of what we have thought. Buddha"; public static void main(String[] args){ MyString ms = new MyString(); char c = ms.str.charAt(5); boolean b = ms.str.contains("w"); boolean b2 = ms.str.contains("z"); int i = ms.str.indexOf("e"); System.out.print(c + "-" + b + "-" + b2 + "-" + i); } }
