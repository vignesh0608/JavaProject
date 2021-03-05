package HandsonExamples;
import java.util.*;
public class GradeCalculation {
	private int id;
	private String name;
	private int[] marks;
	private float average;
	private char grade;
	public void getmarks(int[] mark) {
		int sizeOfArray=mark.length;
		 this.marks=new int[sizeOfArray];
		for(int i=0;i<marks.length;i++) {
			marks[i]=mark[i];
			System.out.println(marks[i]);
		}
		System.out.println(mark.length);
		for(int i=0;i<marks.length;i++) {
			System.out.println(marks[i]);
		}
		System.out.println(marks.length);
	}
	public int[] getArray() {
		System.out.println(marks.length);
		return marks;
	}
	public static void main(String args[]) {
		GradeCalculation gc=new GradeCalculation();
		int marks[]= {50,60,70};
		gc.getmarks(marks);
		int[] returnMarks=gc.getArray();
		for(int i:returnMarks) {
			System.out.println(i);
		}
	}
}
