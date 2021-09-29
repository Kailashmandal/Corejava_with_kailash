public class ExceptionHandling2 {
    public static void main(String[] args) {
       try {
            int [ ] arr={2,3,4};
            int x=arr[3]+1; // will give exception
       }
       catch (ArrayIndexOutOfBoundsException obj){
           System.out.println("Exception caught!!");
           System.out.println(obj.getMessage()); // will give what is actual exception in program

            obj.printStackTrace(); // will give exception stack
       }
        System.out.println("out of try-catch blocks.");
    }
}
