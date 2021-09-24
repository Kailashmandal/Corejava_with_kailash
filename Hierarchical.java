class A{
    int rollno;
    String name;
    void setRollno(int rollno){
        this.rollno=rollno;
    }
    void setName(String name){
        this.name=name;
    }
}
class B extends A{ //b is extended by A
    int heigth;
    void setHeigth(int heigth){
        this.heigth=heigth;
    }
}
class C extends A{  // C is extended by A
    int age;
    void setAge(int age){
        this.age=age;
    }
}
class D extends A{  //D is extended by A
    int marks;
    void setMarks(int marks){
        this.marks=marks;
    }
}
class E extends D{ //E is extended by D
    int sport_rating;
    void  setSport_rating(int sport_rating){
        this.sport_rating=sport_rating;
    }
    void showDetails(){
        System.out.println("name is : "+name);
        System.out.println("roll no is : "+rollno);
        System.out.println("marks is : "+marks);
        System.out.println("sport rating is : "+sport_rating +" out of 10.");
    }
}
public class Hierarchical {
    public static void main(String[] args) {
        E obj=new E();
        obj.setRollno(5);
        obj.setName("kailash");
        obj.setMarks(90);
        obj.setSport_rating(9);
        obj.showDetails();
    }
}
