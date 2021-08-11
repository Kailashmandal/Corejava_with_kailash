import java.util.Scanner;

public class Nth_Fibonacci {
    public static void main(String[] args) {
        // fibonacci series printing
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int a=0;
        int b=1;
        int count;
        for ( count = 2; count <=n ; count++) {
            int temp=b;
            b=b+a;
            a=temp;
        }
        System.out.println(b);
        in.close();
    }   
}
