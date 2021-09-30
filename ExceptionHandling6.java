import java.io.FileNotFoundException;

/*
throws clause : is used when we already know that this method is going to give exception.

 */
public class ExceptionHandling6 {
    static void Demo() throws FileNotFoundException{
        throw new FileNotFoundException("throws demo !! ");
    }

    public static void main(String[] args) {
        try {
             Demo();
        }catch (FileNotFoundException obj){
            System.out.println("Exception caught !! ");
            System.out.println(obj.getMessage());
        }
    }
}
