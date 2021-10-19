import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    /*
    ArrayList is and class in java that implements List interface and extends AbstractList class ,it is more
    like a dynamic array with implemented methods.

    public class ArrayList<E> extends AbstractList<E> implements List<E>,RandomAccess,Cloneable,S

   Constructors:   1. ArrayList() : creates an empty Arraylist
                   2. ArrayList(Collection<? extends E> c) : creates an Array list initialized with elements of c collection.
                   3.ArrayList(int size)  : creates an array list of size specified
     */
    public static void main(String[] args) {

        // always use wrapper class for providing the type of element
        ArrayList<Integer> arr=new ArrayList<>(); // this will create an empty array list of type integer

        // add method is used to add element at position of array list and default index is 0
        arr.add(5);
        int first_element= arr.get(0); // get(position ) will give element at specified position
        System.out.println("first_element is : "+first_element);

        // lets add more elements
        for (int i=2;i<6;i++){
            arr.add(i*5);
        }

        /*
        Iteration : iteration can be done in three ways . 1. using for loop
                                                          2. using for each loop
                                                          3. using iterator of collections

         arr.size() : will give the size of the arraylist in integer
         */

        //  for loop iteration using and printing each element
        System.out.println("for loop iteration and printing each element :-");
        for (int i=0;i<arr.size();i++){
            System.out.print(arr.get(i)+" ");
        }

        // foreach loop iteration and printing each element
        System.out.println("\nforeach loop iteration and printing each element :-");
        for (int element : arr){
            System.out.print(element+" ");
        }

        // set : method is used to set the elements at specified position . void set(position , value)
        arr.set(3 ,50); // setting element at index 3 to 50 without increasing length
        System.out.println("\nElement at 3rd index : "+arr.get(3)+" and length is : "+arr.size());

        // we can also use add method to add element at specified position with increasing length
        arr.add(4,35);
        System.out.println("length is : "+arr.size());

        /*
        Removing element in the array list by remove() method

        1. remove(object o ) : will remove the specified object , returns -1 if element not present
        2. remove(index )         : will remove the element at given pos
        2. removeAll(collection<?> c)  : will remove all element of c collection
        4. remove(start position , end position)  : will remove in this given range

         */
        for (int el:arr) System.out.print(el+" ");
        arr.remove(5);
        System.out.print("\nlength is : ");
        System.out.println(arr.size());
        // now last element should be 35 instead of 25
        System.out.println(arr.get(arr.size()-1));

        // so if we want to remove all elements from end
        int len=arr.size();
        for(int i=0;i<len;i++){
            arr.remove(arr.size()-1);
        }
        System.out.println("size after removing all elements : "+arr.size());
        for (int el:arr) System.out.print(el+" ");

        // for now just add more elements in arr and create one more array list
        for (int i=2;i<6;i++){
            arr.add(i*5);
        }
        System.out.println("\nAfter adding elements :-");
        for (int element : arr){
            System.out.print(element+" ");
        }
        // instead of removing each element by loop we can use removeAll(collection name ) method
        arr.removeAll(arr); // it will remove all the elements of give collection
        System.out.println("\nAfter removeAll method arr is : ");
                     //OR use clear() method
        System.out.println("after adding elements arr is : ");
        for (int i=2;i<6;i++){
            arr.add(i*5);
        }
        System.out.println(arr);

        arr.clear(); // clears all elements

        // we can also print like this :-
        System.out.println("after using clear method arr is : "+arr);
        ArrayList <Integer> krr=new ArrayList<>(); // krr is new arraylist
        // for now just add elements in arr
        for (int i=2;i<6;i++){
            arr.add(i*5);
        }
        System.out.println("size of arr is : "+arr.size()+"\nSize of krr is : "+krr.size());

        // addAll(list c) : is used to copy all the values present in one array list to another
        krr.addAll(arr); // it will copy all the element of arr into krr
        System.out.println("krr is :"+krr+"\narr is : "+arr);
        krr.add(50); // adding extra element

        // we can remove all copied values of arr from krr
        krr.removeAll(arr);
        System.out.println("After removing all arr elements krr is : "+krr);

        krr.add(51);
        krr.add(52);
        krr.add(53);
        krr.add(54);
        krr.add(55);
        System.out.println("krr is : "+krr);
        // lets use our 2nd constructor
        ArrayList<Integer> hrr=new ArrayList<>(krr);// it will directly initialise the hrr with elements of krr
        System.out.println("hrr is : "+hrr);
    }
}
