import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;
import java.util.Arraylist;
import java.util.List;
javac listArray.java; 



public class listArray  {
    public static void main(String[] args) {
        /*int[] intarray ={1,2,3,4,5};
        System.out.println(intarray[4]);
        intarray[4] = 6;
        System.out.println(intarray[4]);

        String[] strarray = {"Sean", "Ryan", "Ella"};

        int[] newArray;
        newArray = new int[]{0,1,2,3};

        int myArray[] = new int[4];
        System.out.println(myArray[1]);

        int[] pause1 = {1,2,3,4};
        
        String[] pause2;
        pause2 = new String[]{"Sean","ella"};

        Boolean[] pause3 = {true,false,true};*/

        /*String[] food = {"pasta","chicken","steak"};
        System.out.println(food[0]);

        for(int i =0; i< food.length; i++){
            System.out.println(food[i]);
        }*/

        // Pause and play

        Integer[] tenInts = {23,45,2,6,56,78,43,90,54,12};
        Arrays.sort(tenInts, Collections.reverseOrder());
        /*for(int i =0; i < tenInts.length; i++){
            System.out.println(tenInts[i]);
        }*/

        System.out.println(Arrays.toString(tenInts));

        //Pause and Play

        Integer[] arr = {3,8,10,6,2};

        int smallest = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < smallest) {
                smallest = arr[i];
            }
        }


        



    }
    
    
}
