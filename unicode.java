public class unicode {
    public static void main(String[] agrs){
        /** Unicode is a international standard for charactor encoding like ASCII.
         * In java we use unicode syatem for charactor encoding.
         * Simpally it means charactors are stored in decimal and hexadecimal codein language.
          */
    // we will see some important unicode value.
    int x=0;
    System.out.print("For A is =");
    System.out.println('A'-x);// as you can see we are subtrackting x which is an integer it means 'A' is also stored some where in decimal code
    System.out.print("For a is =");
    System.out.println('a'-x);

    /**for some special charactors */
    System.out.println('^'-x);
    System.out.println('+'-x);
    System.out.println('$'-x);

    /** you can remember 'A'=65 and 'a'=97 thats it. */
    /** for more info you can search unicode system for java. */
  }
    
}
