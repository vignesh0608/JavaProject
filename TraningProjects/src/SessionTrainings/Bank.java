package SessionTrainings;

import java.util.*;
public class Bank {
    String eid;
    String empname;
    float balance=0;
    public void depositAmount(String id, String name,float addAmount) {
        eid=id;
        empname=name;
        balance= addAmount + balance;
        System.out.println("Employee Name:"+empname);
        System.out.println("Employee ID:"+eid);
        System.out.println("Current Balance:"+balance);
    }
    public void withdrawAmount	(String id, String name, float withdrawAmount) {
        if(balance<withdrawAmount) {
            System.out.println("Insufficient Balance");
        }
        else {
            balance=balance-withdrawAmount;
        }
        eid=id;
        empname=name;

        System.out.println("Employee Name:"+empname);
        System.out.println("Employee ID:"+eid);
        System.out.println("Current Balance afther widhdrawing:"+balance);
    }
    public static void main(String args[]) {
        Bank b=new Bank();
        Scanner s = new Scanner(System.in);
        String ename,eid;
        float balance;
        int count=0;

        System.out.println("Menu");
        System.out.println("1.Deposite");
        System.out.println("2.Withdraw");
        System.out.println("3.Exit");
        count=s.nextInt();
        while(count!=3) {

            if(count==1) {
                System.out.println("Enter the Employee name:");
                ename=s.nextLine();
                System.out.println("Enter the Employee ID:");
                eid=s.nextLine();
                System.out.println("Enter the Deposite Amount");
                balance=s.nextFloat();
                b.depositAmount(eid, ename, balance);
            }
            else if(count==2) {
                System.out.println("Enter the 2Employee name:");
                ename=s.nextLine();
                System.out.println("Enter the Employee ID:");
                eid=s.nextLine();
                System.out.println("Enter the Withdraw Amount");
                balance=s.nextFloat();
                b.withdrawAmount(eid, ename, balance);
            }
            System.out.println("Menu");
            System.out.println("1.Deposite");
            System.out.println("2.Withdraw");
            System.out.println("3.Exit");
            count=s.nextInt();
        }
        s.close();
    }
}
