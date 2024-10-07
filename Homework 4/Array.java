
/*
Take the given array and keep track of:
1. Any duplicate numbers
2. How many times the duplicate numbers appear
3. Print out those duplicate numbers with how many times they appear

 */

 public class Main {
    public static void main(String[] args) {
        //Don't let the size of this scare you! no matter how big an array is, it all works the same!
        int[] myArray = {10,3,295,38,20,3,4,267,2445,10,5566,87,93,17,10,2,87,267,3176,3,82};
        //you cannot use the array util. Do this one by hand :( 
        
        
        for (int i = 0; i < myArray.length; i++) { //This for loop will loop through array
            boolean duplicate = false;

            for (int j = 0; j < i; j++) { // This for loop will then recognize a duplicate
                if (myArray[i] == myArray[j]) {
                    duplicate = true;
                    break; // googled how to end a loop as I had a problem where it wouldn't stop
                } 
            }

            
            if (duplicate) { // if the boolean duplicate is true then continue to next
                continue; // had to google to find this if loop as I was having a problem where each duplicate was printing out more 
            }

            int appear = 1; // set a variable to start counting the duplicates

            for (int j = i + 1; j < myArray.length; j++) { // this will add to the appear variable when a duplicate is recognized
                if (myArray[i] == myArray[j]) {
                    appear++;
                }
            }

            // now will print if duplicate appears
            if (appear > 1) {
                System.out.println("The number " + myArray[i]+ " is a duplicate and appears " +appear+ " times");
            }
        }
    }
}