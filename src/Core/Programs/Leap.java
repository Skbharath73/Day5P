package Core.Programs;
import java.util.Scanner;
public class Leap {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        int year=s.nextInt();
        s.close();
        if(year%100 == 0) {
            if(year%4 == 0 &&  year%400 == 0) {
                System.out.println("leap year");
            }
            else
                System.out.println("Not Leap Year");
        }

        else if(year%4==0) {
            System.out.println("Leap Year");
        }
        else
            System.out.println("Not Leap Year");
    }
}
