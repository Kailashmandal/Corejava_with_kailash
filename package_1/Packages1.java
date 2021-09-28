/*
Package : A package in java is group of similar kind of classes , interfaces , subPackages and constant declaration.

   type of packages :
   1.Built-in package                           2. User defined package
   Already defined package                           package created by users.
   and part of java .                               (created using package keyword)

   example : java.lang , java.net
            java.util , java.applet
 */
package package_1; // creating package
public class Packages1 {

    public void sum(int a , int b ){
        System.out.println(a+b);
    }
    public static void main(String[] args) {
        System.out.println("first package ! ");
    }
}
