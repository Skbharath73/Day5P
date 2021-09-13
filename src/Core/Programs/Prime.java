package Core.Programs;
import java.util.Scanner;
public class Prime {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        s.close();
        int i,a,flag=0;
        System.out.println("prime factors ");
        for(i=2;i<n;i++){
            if(n%i==0){

                a=i;

                for(int j=2;j<a/2;j++) {
                    if (a % j == 0) {

                        flag = 1;
                        break;
                    }
                }

                if(flag==0){

                    System.out.println(a);
                }
            }

        }
    }
}
