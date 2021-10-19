interface Greet{
    // interface with abstract method greet
    void greet();
}
class ImplementGreet implements Greet{
    @Override
    public void greet() {
        System.out.println("Implementing the Greet.");
    }
}
interface Add{
    int sum(int a ,int b);
}
public class LambdaExpression1 {
    /*
    Lambda Expressions : Lambda Expression provides the implementation of  functional interface
    (Functional interface : interface with only with one abstract method),and signature of the abstract method
    should match with the lambda expression.

    lambda expression can be treated as inline function that provides the implementation of
    abstract method in the single expression.

    syntax:
          TypeOfLambdaExpression  Lambda_expression_name =(argument list)->{  body  };

     */
    public static void main(String[] args) {

        // making a lambda expression for greet method
        Greet wish=()->{
            // compiler internally detect the abstract method in Greet interface
            System.out.println("Happy coding..");
        };
        wish.greet();// calling greet method

        // you can also skip curly braces for single line of implementation
        Greet wish1=()->System.out.println("Happy coding again..");
        wish1.greet();

        // now we do not have to create a class that is implementing the interface class
        new ImplementGreet().greet(); // will give same result

        // implementing Add interface using lambda
        Add s=(a,b)-> {
            return a + b;
        };
            // we can also omit return word
        System.out.println("Lambda sum is : "+s.sum(3,7));
    }
}
