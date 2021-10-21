import java.util.LinkedList;

public class LinkedList1 {
    /*
    LinkedList class : is like ArrayList class most method are same.
    constructor :
      1. LinkedList(): creates an empty ll
      2. LinkedList(collection c): creates a ll initialized with elements of list c.

     */
    public static void main(String[] args) {
        LinkedList <String > lis=new LinkedList<>();
        lis.add("One");
        lis.add("Two");
        lis.add("Three");
        lis.add("Four");
        lis.add("Five");
        // linked list also follows index accessing
        for (int i=0;i<lis.size();i++){
            System.out.print(lis.get(i)+" ");
        }
        //OR
        System.out.println("\n"+lis);

        /*
        addFirst(element) : add an element at first position
        addLast(element): add an element at the back of list
         */

        lis.addFirst("The ");
        lis.addLast("End ");

        /*
        getFirst() : return the first element
        getLast() : return last element of list
         */

        System.out.println("First element is : "+lis.getFirst());
        System.out.println("Last element is : "+lis.getLast());

        /*
        we can also use peek() method.
        Peek() : return first element
        peekFirst() : returns first element or -1 if not present
        peekLast() : returns last element or -1 if not present
         */

        System.out.println("using peek element : ");
        System.out.print(lis.peek());
        System.out.print(lis.peekLast());

        System.out.println("\nlist is : "+lis);

        LinkedList<String> lis2=new LinkedList<>(lis);// using 2nd constructor
        System.out.println("list2 is : "+lis2);

    }
}
