import java.util.Stack;
/*
STack : internally class vectors and implements List interface and LIFO data structure
 */

public class Stack1 {
    public static void main(String[] args) {
        Stack<String > st=new Stack<>();// creating a stack
        st.push("one");
        st.push("two");
        st.push("Three");
        st.push("Four");
        st.push("Five");

        System.out.print(st);
        st.pop();// it pops out element present at top
        System.out.println(st);
        System.out.println("Top element is : "+st.peek()); // peek method returns top element
        System.out.println("Five is present : "+st.search("Five"));// search() will return weather element is present
        // or not

    }
}
