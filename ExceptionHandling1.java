
public class ExceptionHandling1 {
    public static void main(String[] args) {
        String str="stack trace";
       // char ch=str.charAt(str.length()+1); // will give exception : StringIndexOutOfBoundsException
    try {
        int x;
       // x=Integer.parseInt("Exception123");
        char ch=str.charAt(str.length()+1);
    }
    catch (/*NumberFormatException obj */ StringIndexOutOfBoundsException obj1){
        System.out.println("Exception caught !! ");
     //   System.out.println(obj.getMessage());
            System.out.println(obj1.getMessage());
    }
        System.out.println("out of the try-catch.");
    }


}
