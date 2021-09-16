
public class Method{
public static void main(String[] args) {
/* instance method : are invoked by using a object of class */
 Method obj=new Method();
 int sum=obj.add(55,44);
 System.out.println("The sum is : "+ sum);

 int mul=obj.multiplication(55,44);
 System.out.print("The multiply is : "+ mul);
}

public int add(int a, int b){ // do not use static keyword 
    return a+b ;
}

// we can create any number of such methods 
public int multiplication(int a ,int b){
   return a*b ;
}
}