package Core.Programs;
import java.util.Scanner;
public class Harmonic {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        System.out.println("Number is :" + N);
        s.close();
        // 1/1,1/2,1/3....1/N
        // firstly converting HP in AP and finding answer later again converting to HP
        int a = 1;
        int d = 1, n;
        double t=0,x;
        n = a + (N - 1) * d;
        System.out.println("The Nth Hramonic number is: 1/"+n);
        for(int i=1;i<n;i++){
            x=(double) 1/i;
            t=t+x;
        }
        System.out.println("Sum is: "+t);
    }
}
