package SessionTrainings;
import java.util.Scanner;
public class ArrayExample {
	public static void main(String args[]) {
		String names[][]=new String[2][2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<2;i++) {
			for (int j=0 ; j<2;j++) {
			System.out.println("Enter the Name");
			names[i][j]=sc.nextLine();
			}
		}
		for (String[] n : names) {
			for(String nam:n) {
				System.out.println("Name:"+nam);
			}
		}
		sc.close();
	}
}
