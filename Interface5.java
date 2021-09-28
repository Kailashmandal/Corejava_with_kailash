/*
Interface constants :
 */
interface Days{
    int mon=1,tues=2,wed=3,thur=4,fri=5,sat=6,sun=7;
}
public class Interface5 implements Days {
    void show(int x){
        switch (x){
            case  mon-> System.out.println("monday");
            case tues -> System.out.println("tuesday");
            case wed -> System.out.println("wednesday");
            case thur -> System.out.println("thursday");
            case fri -> System.out.println("friday");
            case sat -> System.out.println("saturday");
            case sun -> System.out.println("sunday");
        }

    }

    public static void main(String[] args) {
        Interface5 in=new Interface5();
        for(int i=1;i<8;i++)
            in.show(i);
    }
}
