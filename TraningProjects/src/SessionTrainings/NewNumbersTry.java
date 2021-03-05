package SessionTrainings;
import java.util.Scanner;
public class NewNumbersTry {
	int sub=0,temp,occ,nine=0,one=0,zero=0;
	public String occurance(int x) {
		temp=x;
		while(temp>0) {
			System.out.println("Loop");
			occ=temp%10;
			sub=sub+occ;
			if(sub==0) {
				zero++;
				System.out.println("Zero");
				sub=0;
			}
			else if(sub==1) {
				one++;
				System.out.println("One");
				sub=0;
			}
			else if(sub==9) {
				nine++;
				System.out.println("nine");
				sub=0;
			}
			else {
				System.out.println("NoNum");
				sub=0;
			}
			temp=temp/10;
		}
		if(x==0) {
			return "0";
		}
		return zero+","+one+","+nine;
		
	}
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Input Number =");
		int x=scanner.nextInt();
		NewNumbersTry n=new NewNumbersTry();
		String nn=n.occurance(x);
		System.out.println(nn);
		scanner.close();
		
	}
}
