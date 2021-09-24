/*
method overriding ...
 */
class K{
    public void show(){
        System.out.println("class K show method");
    }
}
class H extends K{
    public void show(){ // same signature as K class
        System.out.println("class H show method");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        H h=new H();
        h.show(); // since we have two show() methods derived class show method is called
                  // this is called method overriding .

        new K().show(); // this will call K class method
    }

}
