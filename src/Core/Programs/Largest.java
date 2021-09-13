package Core.Programs;
import java.util.Scanner;
public class Largest {
    public static void main(String args[]){
    Scanner s= new Scanner(System.in);
    int a=s.nextInt();
    int b=s.nextInt();
    int c=s.nextInt();
    if(a>b && a>c){
        System.out.println("larger num is: "+a);
    }
    else if(b>c && b>a){
        System.out.println("Larger num is: "+b);
        }
    else
        System.out.println("larger num is: "+c);
    }
}
