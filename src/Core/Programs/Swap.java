package Core.Programs;

public class Swap {
    public static void main(String args[]){

        //initially a=10 and b=5
        int a=10,b=5,temp;
        temp=a;
        a=b;
        b=temp;
        //later a=5 and b=10
        System.out.println("a is: "+a);
        System.out.println("b is :"+b);
    }
}
