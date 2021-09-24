class  Students{
    int Rollno;
    String name;
    void setRollno(int Rollno){
        this.Rollno=Rollno;
    }

    void setName(String name){
        this.name=name;
    }
}

class Student_details extends Students{  // level 1 of inheritance
    int age;
    int height;
    int weight;
    void setAge(int age){
        this.age=age;
    }
    void setHeight(int height){
        this.height=height;
    }
    void setWeight(int weight){
        this.weight=weight;
    }
}
class Student_performance extends Student_details{ //level 2 of inheritance
    int sport_rating ;
    int marks;
    void setSport_rating(int sport_rating){
        this.sport_rating=sport_rating;
    }
    void setMarks(int marks){
        this.marks=marks;
    }

    void showPerformance(){
        System.out.println("name is : "+name);
        System.out.println("Roll no is : "+Rollno);
        System.out.println("age is : "+age);
        System.out.println("height is : "+height);
        System.out.println("sport rating : "+sport_rating);
        System.out.println("marks is : "+marks +" out of 10 ");
    }

}
public class Multilevel_Inheritance {
    public static void main(String[] args) {
        Student_performance s=new Student_performance();
        s.setHeight(20);
        s.setName("kailash");
        s.setHeight(171);
        s.setRollno(5);
        s.setAge(21);
        s.setSport_rating(10);
        s.setMarks(9);
        s.showPerformance();
    }
}
