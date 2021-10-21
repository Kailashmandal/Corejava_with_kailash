import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;
public class ArrayList2 {
    /*
    Iterator class: is used to iterator over the list .
            syntax: Iterator<E> iterator() creates an iterator over list


    ListIterator<E> listIterator(int index) : method is used to create an iterator over a list
    from specified index.
     */
    public static void main(String[] args) {
        // creating an iterator over Arraylist
        ArrayList <String> arr=new ArrayList<>();
        arr.add("One");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        arr.add("Five");

        /*
        Creating an iterator .

         */
        System.out.println("Iterating forward : ");
        Iterator<String> itr=arr.iterator();
        while (itr.hasNext()){
            String str=itr.next();
            System.out.print(" "+str);
        }

        // creating list iterator for arr
        System.out.println("\nIterating reverse :");
        ListIterator<String> list_itr=arr.listIterator(arr.size());// list_itr is pointing to place after last element
        while (list_itr.hasPrevious()){
            String str=list_itr.previous();
            System.out.print(" "+str);
        }

        /*
        Sorting the Arraylist:

        sort(collection name ) : is present in Collections class which is used to sort list.
         */

        List <Integer> krr=new ArrayList<>();
        krr.add(10);
        krr.add(55);
        krr.add(23);
        krr.add(11);
        krr.add(45);
        System.out.println("\nkrr without sorting : "+krr);
       // sorting the list krr
        Collections.sort(krr);
        System.out.println("krr after sorting :" +krr);

        // sorting in decreasing order
        krr.sort(Collections.reverseOrder());
        System.out.println("krr after sorting in decreasing order : "+krr);
    }
}
