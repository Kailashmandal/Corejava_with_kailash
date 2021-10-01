/*
Multiple catch statement: we can have multiple catch statement in single catch block
we can do this by using OR ( | ) operator .

synatx :  catch(Exception1 | Exception2 object){
             handling
             }
 */
public class ExceptionHandling10 {
    public static void main(String[] args) {
        try{
            // throwing an exception form try block to catch..
            throw new ArithmeticException("Throwing Arithmetic Exception!! ");

        }
        catch (NumberFormatException | ArithmeticException obj){ // giving more than one Exception options
            System.out.println("Exception caught !! \nPrinting exception stack...  ");
            obj.printStackTrace();
        }
    }

}
