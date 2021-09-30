/*
throw keyword is used explicitly throw an exception.

-> mainly used to throw a custom exceptions.
-> checked and unchecked both exception can be thrown.
-> we can also throw a user defined exception

syntax :    throw Exception_Object ;
 */
public class ExceptionHandling3 {
    public static void main(String[] args) {
        try{
            NumberFormatException obj;
            obj=new NumberFormatException("throw example ! ");
            throw obj;
        }
        catch (NumberFormatException e){
            System.out.println("Exception is  caught ! ");

            System.out.println(e.getMessage());

            System.out.println("Exception stack is : ");
            e.printStackTrace();
        }
    }
}
