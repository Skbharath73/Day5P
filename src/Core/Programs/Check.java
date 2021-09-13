package Core.Programs;
import java.util.Scanner;
public class Check
{
public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    System.out.println("Number is :"+i);
    s.close();
    if(i%2==0){
        System.out.println("even");
    }
    else
        System.out.println("odd");
}
}
