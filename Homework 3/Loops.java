/*
challenge file!
this one isn't too tough but it does require a little bit of writing and some googling
figure out how to take a string from the user
then print back out every individual letter one letter per line
I also am requiring a small write up: explain your discovery to me.
how did you figure out how to do this? can you translate your code into simple terms? 
you need to explain why you picked your for loop conditional and what's doing the work with the string
if you're confused reach out!
 */

import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // name the scanner
        
        System.out.println("Please provide a string: "); // print out a statement 
        String input = sc.nextLine(); // get input from user
        
        
        for (int i = 0; i < input.length(); i++) { // googled how to find the length of a users input
            System.out.println(input.charAt(i)); // googled how to get each character of the string independently 
        }
        
        
        
    }
}

//For this I decided to use a for loop, set an int i to 0 , then made the for loop run for the length of the string. 
// Then had the for loop printed out each character 1 by 1 , used google to find how to split each character up.

       



    

