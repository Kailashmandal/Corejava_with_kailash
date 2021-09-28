
import package_1.Packages1; // we can import our package like this
/*
import means : including a package into our program

general syntax : import.package_name.sub_package_name.class_name ;
        if we put * instead of class name then it will import every thing the package .
 */
public class Packages2 {
    public static void main(String[] args) {
        Packages1 p=new Packages1();

        p.sum(5,6);
        p.sum(10,9);
        p.sum('a','z');
    }
}
