import java.util.Arrays;
import java.util.Scanner;

public class Array2 {

    /* 2D arrays are array of arrays also called matrix 

    syntax of declaration :

    data_type [][] ref_name=new data_type[row][column];


     * while initalising the 2cd array it is needed to give row size 
       but not column size .
    */
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);

        int [][] arr=new int[3][4];

        // taking input in matrix
        System.out.println("enter the elements ");
        for(int i=0;i<arr.length;i++){ // for each row 

            for(int j=0;j<arr[i].length;j++){ // each column of each row
              arr[i][j]=in.nextInt();
            }
        }

        // printing the matrix 
        System.out.println("the matrix is : ");
        for(int i=0;i<arr.length;i++){ // for each row 

            for(int j=0;j<arr[i].length;j++){ // each column of each row
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        // OR
         System.out.println("By toString method : ");
        for(int i=0;i<arr.length;i++){
            System.out.println(Arrays.toString(arr[i]));
        }

        //OR by using for-each loop
        System.out.println();
        for (int[] is : arr) {
            System.out.println(Arrays.toString(is));
        }
        in.close();

    }
}
