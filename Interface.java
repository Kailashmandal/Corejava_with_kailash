/*
Interface: the interface is just like a class but all its methods are abstract with signature only.

general declaration :

access_specifier interface interface_name{
// methods signature only.

// constants
}

-> use interface keyword to declare an interface.
-> default specifier is public.
-> constants by default static and final.
-> we can have references of interfaces but not object.

 */

// example :-
interface printable{
    void print();
}

public class Interface implements printable {
    public void print(){
        System.out.println("interface example !");
    }

    public static void main(String[] args) {
        Interface in=new Interface(); // reference and object of class Interface .
        in.print();

        //OR

        printable pt/* reference of type printable */=new Interface(); // object of Interface class
        pt.print();
    }
}
