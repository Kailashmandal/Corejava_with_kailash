public class Array2 {
    public static void main(String[] args) {
        /* cloning a array in java using clone function */

        int arr[]={ 1,2 ,3 ,4 ,5 ,6};
    
        int crr[]= arr.clone(); // clone function creates a deep copy 

        // printing the crr 
        System.out.println("Crr is : ");
        for (int i : crr) {
            System.out.print(i+" ");
        }

    }
}
