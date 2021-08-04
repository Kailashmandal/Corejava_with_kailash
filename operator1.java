public class operator1 {
    public static void main(String[] agrs) {
        /** An operator is a symbol that tells compiler to perform a
         * mathematical or locial task.
         * types- arithmetic operator ,unary operator ,assignment operator,relational , logical,assignment ,conditional , bitwise,ternary etc.
         * we will demonstrate each and every one by one.
         */
    
         /**arthmetic operator are used to perform mathematical tasks 
          * [+(addition) , -(subtraction) , *(multiplication) , /(division) , %(modulus)]
          */
       int a=10;
       int b=5;
       int c=2;
       
      int x=a+b; // for adding a and b 
      int y=a-b; // for subtraction
      int p=b*c; // for multiplication
      int d=a/b; // for division
      int r=b%c;  // for remainder

      System.out.println("x is = "+x);
      System.out.println("y is = "+y);
      System.out.println("p is = "+p);
      System.out.println("d is = "+d);
      System.out.println("r is = "+r);

      /** Increment(++) and decrement operators(--) 
       * variable_name++ or var-- is post increment and drecrement
       * ++var or -- is pre increment and pre decrement respectively
       */
      System.out.println(a++); // a will be incresed by 1 after the excution of this satement
      System.out.println(++b); // b gets decresed by 1  then staement will excute
      System.out.println(a--);
      System.out.println(--b);
  
      /** "=" is assigment operator we can assign a variable to any value or other variable */
      int i=a; // assigning the value of a to i
      System.out.println("i is = "+i);
    
      /** Relational operators are used to find relation btw two var. or const.
       * it will always give true or false value
       * these are  >(greater than) , <(less than), >=(greater than equal to)
       * <= , ==(equal to) , !=(not equal to)
       */
      System.out.println(a>b);
      System.out.println(a!=b);
      System.out.println(a==b);
 
    }
}
