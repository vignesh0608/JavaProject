package SessionTrainings;
import java.util.Scanner;
public class Numbers {
	public String numberOccurrence(long x) {
		String num=String.valueOf(x);
		int zeroCount=0;
		int oneCount=0;
		int nineCount=0;
		for(int i=0;i<num.length();i++) {
			char check=num.charAt(i);
			if(check=='1') {
				oneCount++;
			}
			if(check=='0') {
				zeroCount++;
			}
			if(check=='9') {
				nineCount++;
			}
		}
		return ""+zeroCount+oneCount+nineCount;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Numbers numberClass=new Numbers();
		System.out.println("Enter the Number:");
		long num=scanner.nextLong();
		String result=numberClass.numberOccurrence(num);
		System.out.println(result.charAt(0)+","+result.charAt(1)+","+result.charAt(2));
		scanner.close();
	}
}
