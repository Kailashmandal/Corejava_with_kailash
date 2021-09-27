/*
Abstract classes with constructor and non-abstract method.
 */
abstract class Bus{
    Bus(){ // constructor of Bus
        System.out.println("Bus is created ! ");
    }

    abstract float speed(int s); // abstract method

    int accelerate(int acc){
        return 3*acc;
    }

}
class Track extends Bus{

    float speed(int s){ // implementation of speed() of abstract Bus class
        return s;
    }

}
public class Abstraction3 {
    public static void main(String[] args) {
        Track T=new Track(); // this will call default constructor of Track
                             // and default constructor of track will call default constructor of Bus.


        System.out.println("speed is : "+T.speed(50));
        
        System.out.println("Acceleration is : "+T.accelerate(50));
    }
}
