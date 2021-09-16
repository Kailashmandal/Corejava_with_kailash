import java.util.Arrays;

public class varargs {

    // we use varargs for the situation where we don't know how many argument
    // we have to pass in method parameters
  /* there can be only one varagrs in a method 
    and it should last in parameter 
    
    syntax :
    
    static return_type name(data_type ...varargs_name){
        // body 
    }
    
    */

    public static void main(String[] args) {
       
        funtion(1,2,3,4,5);
    }

    static void funtion(int ...v){
        System.out.println(Arrays.toString(v));
    }

}
