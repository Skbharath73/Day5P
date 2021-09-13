package Core.Programs;
import java.util.Scanner;
public class Vowel {
    public static void main(String args[]){

        Scanner s = new Scanner(System.in);
        char c= s.next().charAt(0);
        System.out.println("Character: "+c);
        s.close();
        if (c == 'a' || c=='e' ||c == 'i'||c=='o'||c=='u' ){
            System.out.println("vowel");
        }
        else
            System.out.println("Consonant");
    }
}
