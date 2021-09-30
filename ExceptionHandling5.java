/*
Handling user define Exception .
 */
class Myexpt1 extends Exception{

}
class Myexpt2 extends Exception{

}
class Myexpt3 extends  Exception{

}
public class ExceptionHandling5 {
    public static void main(String[] args) throws Exception{
        // creating an object of exception type classes which is user define
      Exception [] arr={
              new Myexpt1(),
              new Myexpt2(),
              new Myexpt3()
      }  ;
      for (int i=0;i<3;i++){
          try {
              throw  arr[i];// throwing each object to catch block
          }catch (Exception obj){
              System.out.println("Exception caught !! ");
              System.out.println();
              System.out.println(obj.getMessage());
          }
      }

    }
}
