package HandsonExamples;

import java.util.Scanner;
public class Associate {
    private int associateid;
    private String associateName;
    private String workStatus;
    Scanner sc = new Scanner(System.in);
    Associate(){

    }
    public int getAssociateid(){

        System.out.println("Enter the Associate ID:");
        return sc.nextInt();
    }
    public void setAssociateid(int associateid){
        this.associateid=associateid;

    }
    public String getAssociateName(){
        System.out.println("Enter the Associate Name:");
        String str= sc.nextLine();
        return str;
    }
    public void setAssociateName(String associateName){
        this.associateName=associateName;
    }

    public static void main(String[] args) {
        Associate a=new Associate();
        a.setAssociateid(a.getAssociateid());
        a.setAssociateName(a.getAssociateName());



    }
}

