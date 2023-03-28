//import com.sun.org.apache.xpath.internal.operations.String;
import java.util.Scanner;

public class baseJava {
    static void love(){
        System.out.println("loveprint");
    }
    public static void main(String[] args) {

        Scanner value1 = new Scanner(System.in);
        System.out.println("Enter the value1");
        Scanner value2 = new Scanner(System.in);
        System.out.println("Enter the value2");

        String username = value1.nextLine();
        String last = value2.nextLine();
        System.out.println(username+last);
       // String upper=last.toUpperCase();
        //String lower=username.toLowerCase();
      String finme = username+last;
             int count =finme.length();
        System.out.println(count);
        System.out.println("welcome to the learning phase");

 if (finme=="VIJAYA"){
     System.out.println("passed");
 }else if (finme!="god"){
     System.out.println("failed");
 }else {
     System.out.println("welcome");
 }
        int gf[] = {4,5,6,7,8};
        System.out.println(gf[0]);
        love();
    }

}
