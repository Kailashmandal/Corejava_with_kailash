class Area{
    int length ,width;

    public void setLength(int length) {
        this.length = length;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    void showArea(){
        System.out.println("area is : "+length*width);
    }
}
class  Volume extends Area{
    int height;

    public void setHeight(int height) {
        this.height = height;
    }
    void showVolume(){
        System.out.println("Volume is : "+length*width*height);
    }
}
public class Inheritance1 {
    /*
    Inheritance:It refers to the fact one class can inherit some part or all part of its behavior or structure
    from any other class.
    benefit : it reduces the over writing of code and increase re-use ability

    class which access the data and structure called as child/ derived / subclass
    and the class from which child .

    derived class object can use the parent class methods and fields.
     */
    // types of inheritance : 1 Single inheritance :- one class is derived by one class
    public static void main(String[] args) {

        Area a=new Area();
        Volume v=new Volume();
        a.setLength(10);// from class object

        // accessing the parent class method from child object
        v.setLength(10);
        v.setWidth(5);
        v.setHeight(10);
       // System.out.println("v area is : ");
        v.showArea(); //

        //System.out.println("v volume is : ");
        v.showVolume();
    }


}
