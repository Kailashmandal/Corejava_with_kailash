public class ObjectInt {
    int rollno;
    String name;

    void insertInfo(int r, String n){
        rollno=r;
        name=n;
    }
    void displayInfo(){
        System.out.println("Name is : "+name+"\nrollNo is : "+rollno);
    }
    /*
    object initialisation by method of class 
     */
    public static void main(String[] args) {
       ObjectInt s1=new ObjectInt();
       ObjectInt s2=new ObjectInt();
       s1.insertInfo(5,"kailash");
       s2.insertInfo(15,"karan");

       s1.displayInfo();
       s2.displayInfo();
    }
}
