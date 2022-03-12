package odev;
import java.util.Scanner;
public class UsAlma {

    static int Recursive_us(int a,int b){   //a taban b us
        if (a==1||b==0){
            return 1;
        }

        else
            return a*Recursive_us(a,b-1);
    }


    public static void main(String[]args){
        int taban,us;
        Scanner input=new Scanner(System.in);
        System.out.println("us olacak sayıyı girin:");
        us=input.nextInt();
        System.out.println("taban olacak sayıyı girin:");
        taban=input.nextInt();
        System.out.println(Recursive_us(taban,us));

    }
}
