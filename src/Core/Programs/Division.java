package Core.Programs;
import java.util.Scanner;
public class Division {
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int N=sc.nextInt();
    int d=sc.nextInt();
    sc.close();
    int r=N%d;
    System.out.println("Reminder is :"+r);
    int Q=(N-r)/d;
    System.out.println("Quotient is: "+Q);

}}
