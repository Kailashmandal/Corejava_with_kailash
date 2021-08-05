public class operator2 {
  public static void main(String[] args){
   /** Logical operators  are &&(AND) , || (OR) , !(NOT)*/
   /** syntax for
    * 
    *  && is ( condition1 && condition2) return ture if both are true otherwise false
    || is (cond1 || cond2) return true if atleast one is true otherwise false
    ! is !(condition) and returns true for false condition and false for  true conditon  */
    
    int a=10; int b=20;
    int c=0; int d=5;

    System.out.println(a>c || d>b); // true 

    System.out.println(a>c && d>b); // false

    System.out.println(!(a>c)); // false

    /** we will see all bitwise operators later in this series.  */
  } 
}
