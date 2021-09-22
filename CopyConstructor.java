public class CopyConstructor {
    /*
    there is no copy constructor in java but we can copy the info like c++ copy constructor
     */
    int tag;
    String name;
    CopyConstructor(){

    }
    CopyConstructor(int t,String n){ // normal parameterised constructor for object 1
        name=n;
        tag=t;
    }
    CopyConstructor(CopyConstructor s){
        tag=s.tag; // a copy constructor for copying the info for another object
        name=s.name;
    }
    void displayInfo(){
        System.out.println("name is : "+name+"\ntag is : "+tag);
    }

    public static void main(String[] args) {
        CopyConstructor st1=new CopyConstructor(3,"spider man");
        CopyConstructor st2=new CopyConstructor(st1);

        st1.displayInfo();
        st2.displayInfo();
        /*
        There is no need of constructor by the way for copying the data of
        one object to another.
        we can do like this:-
         */
        CopyConstructor st3=new CopyConstructor();
        st3.name= st1.name;
        st3.tag= st2.tag;
        System.out.println("copying without constructor");
        st3.displayInfo();
    }
}
