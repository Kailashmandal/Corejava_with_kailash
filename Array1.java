import java.util.Arrays;
import java.util.Scanner;

/* Arrays in java is class objects of which contains the elements of same data type 
   indexing of array starts with 0 .

   syntax : 

   data_type[] ref_name=new data_type[size of array];

   */

public class Array1 {
    
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        // declaring an array of size 6
        int [] arr=new int[6];
        
        // taking input in array by for loop
         for(int i=0;i<arr.length;i++){
             arr[i]=in.nextInt();
         }
 
         // printing with for loop
         for(int i=0;i<arr.length;i++){
             System.out.print(" "+arr[i]);
         }
         System.out.println();

         // printing the array with for-each loop
         for (int i : arr) {
             System.out.print(i +" ");
         }
 

         // printing array with tostring method
         System.out.println(Arrays.toString(arr));
         in.close();
    }
}
