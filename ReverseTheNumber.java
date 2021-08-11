import java.util.Scanner;

public class ReverseTheNumber {
    public static void main(String[] args) {
        // reverse s given number
        Scanner in=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=in.nextInt(); // input number
        int num=0;
        while (n>0){
            int temp=n%10; // take remainder of n

            num=num*10 +temp;  // add the remainder to your answer by multiplying each time by 10


            n = n/10; // reduce the n by 10 times
        }
        System.out.println("The reverse number is = "+num);
        in.close();
    }
  //in.close();
}
