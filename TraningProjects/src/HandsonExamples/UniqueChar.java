package HandsonExamples;
import java.util.Scanner;
public class UniqueChar {

    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        String txt;
        int count=0;
        boolean isHavingNumber=false;
        System.out.println("Enter the Sentence:");
        txt=scr.nextLine();
        String numberList="0123456789";
        char empty=' ';
        for(int i=0;i<txt.length();i++){
            char temp=txt.charAt(i);
            for (int k=0;k<10;k++){
                if(temp==numberList.charAt(k)){
                    isHavingNumber=true;
                }
            }
        }
        if (isHavingNumber){
            System.out.println("Invalid sentance");
        }
        else{
            for(int i=0;i<txt.length();i++){
                char temp=txt.charAt(i);
                int tempcount=0;
                for(int j=0;j<txt.length();j++) {
                    if(txt.charAt(j)==temp && temp!=empty){
                        tempcount++;
                    }
                }
                if (tempcount==1){
                    System.out.println(temp);
                    count++;
                }
            }
            if(count==0){
                System.out.println("There is No unique Characters");
            }
        }
        scr.close();
    }
}
