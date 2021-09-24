class base{
    int data;
    void show(){
        System.out.println("data of base is : "+data);
    }
}
class Derived extends base{
    int data=50; // same reference variable like in base class.
    void show(){ // same method like in immediate base class
        super.data=10; // this will initialise the base class data with 10
        super.show(); // calling base class show() method

        System.out.println("data of Derived : "+ this.data);
    }
}
class  Base1{
    Base1(){
        System.out.println("default constructor of Base ");
    }
}
class Derive extends Base1{
    // if we don"t write any default constructor is called which further calls default constructor of Base1.
}
class Derive1 extends Base1{
    Derive1(){
        // here also base1 default constructor is called .
        System.out.println("default constructor of Derive1 ");
    }
}
class Derive2 extends Base1{
    Derive2(){
        super(); // it will call the base class default constructor .
        System.out.println("default constructor of Derive2 ");
    }
}
/*
from this we conclude that base class constructor is always called with default constructor of
derived class.
 */
public class SuperKeyword2 {
    public static void main(String[] args) {
        Derived d=new Derived();
        d.show(); // calling derived class method

        Derive b=new Derive();
        Derive1 c=new Derive1();
        Derive2 k=new Derive2();

    }
}
