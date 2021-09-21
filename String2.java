import java.util.ArrayList;
import java.util.Arrays;

public class String2 {
    public static void main(String[] args) {
        /*
        '+' is overloaded in java for strings which can work as concatenation operator
        like  string + string
        -> string + integer
        ->string + object
        but one should be string in that expression

        wrong -> object + object
         */
        System.out.println("a"+"bc");
        // OR
        System.out.println("kailash"+ 1234);

        // OR
        System.out.println("kailash"+ new ArrayList<Integer>());
    }
}
