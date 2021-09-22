public class ConstructorOverload {
    /*
    constructor can be overloaded like the method, and they are differentiated by number and type of parameter .
     */
    public  int Roll_no;
    public String name;
    public int age;
    public  int marks;
    public int percentage;
    ConstructorOverload(int r,String n,int a){ //first constructor will initialize only general info
        Roll_no=r;
        name=n;
        age=a;
    }

    ConstructorOverload(String n,int m,int p){ // it will initialize only test info
        name=n;
        marks=m;
        percentage=p;
    }
    void General_info(){
        System.out.println("roll no : "+Roll_no);
        System.out.println("name is : "+name);
        System.out.println("age is : "+age);
    }
    void Test_info(){
        System.out.println("name is : "+name);
        System.out.println("marks is : "+marks);
        System.out.println("percentage is : "+percentage);
    }
    public static void main(String[] args) {
        ConstructorOverload st1=new ConstructorOverload(5,"kailash",21);
        ConstructorOverload st2=new ConstructorOverload("kailash",95,85);

        st1.General_info();
        st2.Test_info();
    }
}
