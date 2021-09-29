/*
static variable : a static variable declared using static keyword .
                -> when we declare a variable static :-
                 1. its value is default 0 and null for object type variables
                 2. a single copy is created and can be used by all objects.
                 3. all objects can see changes in it.
                 4. it is memory efficient.
 */
public class StaticKeyword2 {
    public int Roll_no;
    public String name;
    public static String College_name="IIT Delhi ";
    StaticKeyword2(int r, String n){
        Roll_no=r;
        name=n;
    }
    void show_details(){
        System.out.println("name : "+name+"\nRoll no : "+Roll_no+"\nCollege_name : "+College_name);
    }
    public static void main(String[] args){
        System.out.println("college name : "+College_name);// college_name is static member

        new StaticKeyword2(5,"kailash").show_details(); // show_detail is not static so we have to
                                                              // use objects of calling it.
    }
}
