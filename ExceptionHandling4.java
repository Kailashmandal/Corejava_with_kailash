/*
Catching all Exception :
           we can catch all exception using "Exception"  class in catch block.
           we need not to take care about any type of exception explicitly.
 */
public class ExceptionHandling4 {
    public static void main(String[] args) throws Exception {

        // creating an array of exception of different types .
        Exception arr[]={
                new ArithmeticException("arithmetic Expt "),
                new NumberFormatException("number format expt "),
                new NullPointerException("Null pointer expt ")
        };

        for (int i=0;i<3;i++){
            try {
                throw arr[i];
            }
            catch (Exception obj){
                System.out.println("Exception caught !! ");
                System.out.println();
                System.out.println(obj.getMessage());
            }
        }
    }
}
