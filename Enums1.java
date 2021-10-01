
import java.util.Arrays;

/*
Enum : Are the data type which can contains a fixed set of constants.
       for e.g. set of days  or set of months etc.

       use enum keyword to declare the enums ...inside or outside a class.

 */
// declaring enum outside a class
enum Season{ WINTER,SUMMER, SPRING, AUTUMN}; //  ";" at end is optional
public class Enums1 {

    // declaring enum inside a class
    enum Days{
        MONDAY,TUESDAY,WEDNESDAY,SUNDAY
    } ;

    public static void main(String []args){
        // iterating over an enum..
        System.out.println("Season are-> ");
        for (Season s : Season.values()){
            System.out.print(s+" ");
        }
        System.out.println("\nDays are -> ");
        for (Days d: Days.values()){
            System.out.print(d+" ");
        }
        System.out.println("\n\nBy using Arrays toString method...");
        System.out.println(Arrays.toString(Days.values()));

        // getting index of values
        /*
        ordinal() is function that return the index of values
         */
        System.out.println("index of WINTER : "+Season.valueOf("WINTER").ordinal());
        System.out.println("index of AUTUMN : "+Season.valueOf("AUTUMN").ordinal());

        Season str=Season.valueOf("SUMMER");
        //OR
        Season s=Season.SUMMER;
        switch (str){
            case WINTER -> System.out.println("Winter is here !!");
            case SUMMER -> System.out.println("Summer is here !! ");
            case SPRING -> System.out.println("Spring is here !! ");
            case AUTUMN -> System.out.println("Autumn is here !! ");
        }
    }
}
