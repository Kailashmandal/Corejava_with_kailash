/*
Super keyword in java is used inorder to access the data member which have name or methods
from immediate base class.
 */
class K1{
    public void show(){
        System.out.println("class K show method");
    }
}
class H1 extends K1{
    public void show(){ // same signature as K class
        //show(); if include like this it will call current show method in which we are.

               // use super keyword
        super.show(); // this will call the show() of class K1 the immediate parent class
        System.out.println("class H show method");
    }
}
public class SuperKeyword {
    public static void main(String[] args) {
        H1 h=new H1();
        h.show();
    }
}
