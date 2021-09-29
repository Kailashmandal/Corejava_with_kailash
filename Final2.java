/*
using final class we can not perform inheritance .

example :-
 */
final class final1{
    final1(){
        System.out.println("default constructor of the final1");
    }
}
// if we try to extend it by inheritance it will give error
/*
class final2 extends final1{
    public void show(){
        System.out.println("show of final2 ");
    }
}
*/

/*
Final blank variable : is uninitialised final variable.

syntax: final data_type var_name;

we can initialize them but only in the constructors.
 */

class final3{
    final int pan_card_num;

    final3(){
        pan_card_num=300;
        System.out.println("pan card number is initialized and can not be change now !");
        System.out.println("pan card num : "+pan_card_num);
        //pan_card_num=9; will give error!!
    }
}
public class Final2 {
    public static void main(String[] args) {
      /*
        final2 f=new final2();
        f.show();

       */
        final3 f=new final3();

    }
}
