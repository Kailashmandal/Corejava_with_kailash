import java.util.Scanner;
public class Conditionals2 {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        // find the largest of three numbers

        int max=a;
        if(b>max){
            max=b;
        }
        if(c>max){
            max=c;
        }

        System.out.println("max. is ="+max);

        // method 2
        int max2=Math.max(a,b); // it will give maximum of a and b using Math.max() function
        max2=Math.max(c,max2); // now it will compare with c from maximum of a and b.

        // or max2=Math.max( c, Math.max(a,b) );
        System.out.println("max2 is = "+max2);
        
        in.close(); // closing the input
    } 
}
