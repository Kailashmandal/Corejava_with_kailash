interface Fuel{
    void Fuel_info();
}
class Car implements Fuel{
    public void Fuel_info(){
        System.out.println("Petrol car !");
    }
}
class Bus1 implements Fuel{
    public void Fuel_info(){
        System.out.println("Diesel Bus !");
    }
}
class Auto implements Fuel{
    public void Fuel_info(){
        System.out.println("CNG Auto ! ");
    }
}
public class Interface4 {
    public static void main(String[] args) {
        Fuel ref[]={ new Car() , new Bus1() , new Auto()};
        for(Fuel reference : ref){
            reference.Fuel_info();
        }
    }
}
