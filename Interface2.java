/*
Relation between class and interface:

1. class extend a class
2. a class implements an interface
3. an interface extends an interface

 */

import javax.swing.*;

/* Interface extends Interface example : */
interface  Course{
void java();
void cPlusPlus();
void Spring();

}
interface OnlineCLasses extends Course{
    void Hybernate();
    void JDBC();
}

public class Interface2 implements OnlineCLasses{
    // the class which is implementing the derived interface have to implement all methods.
    public void java(){
        System.out.println("Learn java");
    }
    public void cPlusPlus(){
        System.out.println("Learn C++ ");

    }
    public void Spring(){
        System.out.println("Learn spring ");
    }
    public void Hybernate(){
        System.out.println("Learn Hybernate ");
    }
    public void JDBC(){
        System.out.println("Learn JDBC ");
    }

    public static void main(String[] args) {
        OnlineCLasses in=new Interface2(); // reference of interface OnlineClasses and object of Interface2

        in.Hybernate();
        in.Spring();
        in.JDBC();
        in.java();
    }

}
