/*
Finally, block : it is a block of code which get executed after the try-catch block.
                 ->it always get executed even the exception id present or not
                 or even when try-catch block have a return statement in a method.
                 -> it is an optional block.
 */
public class ExceptionHandling9 {
    static void surprize(){
        try {
            System.out.println("returning from the method surprize!!!");

            return; // return statement is unnecessary here/
        }
        finally {
            System.out.println("In surprize finally method !! ");
        }
    }
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("try block ");
        }
        catch (ArithmeticException obj){
            System.out.println("Exception caught !! \n printing exception stack....");
            obj.printStackTrace();
        }
        finally {
            // it will always get executed ....
            // if a method have return statement in try-catch block
            surprize();
            System.out.println("In finally block of main !!");
        }

        // if a method have return statement in try-catch block
       // surprize();

    }
}
