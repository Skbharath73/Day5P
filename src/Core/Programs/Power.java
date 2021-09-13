package Core.Programs;
import java.util.Scanner;
public class Power {

    public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
        int N=sc.nextInt();
        sc.close();
        int res;
        for(int i=1;i<=N;i++){
            res= (int) Math.pow(2,i);
            System.out.println(res);
        }
    }
}
