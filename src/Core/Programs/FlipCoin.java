package Core.Programs;
import java.util.Scanner;
public class FlipCoin {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("no of times: "+n);
        s.close();
        int i,count=0,count1=0;
        double p1,p2,r,r1;
        Boolean Tails=true,Heads=false;
        boolean Flag=true;

        for(i=1;i<=n;i++){
            float c=(float)Math.random();
            System.out.println(c);
            if(c<0.5){
                Flag=false;
                //System.out.println("Heads");
                count1++;
            }
            else {
                Flag = true;
                //System.out.println("Tails");
                count++;
            }

        }
        System.out.println("no of heads: "+count1);
        System.out.println("no of Tails: "+count);
         p1=count *100;
         r=p1/n;
        System.out.println("percent of Tails: "+r);
        p2=count1*100;
        r1=p2/n;
        System.out.println("Percent of Heads: "+r1);
    }



}
