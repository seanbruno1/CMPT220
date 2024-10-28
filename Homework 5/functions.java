/*
for this one, if you remember, I asked you to come up with a 'reason' for a function and implement it. 
Now you get to do it! yay!!!!!
please go a little more complex than just simple math/simple printing for the function
feel free to google some inspiration though :)
*/

//In hockey their is a sv% stat which is saves/shots I'll have the user input these and will get back the percentage

import java.util.Scanner;

public class functions {
    public static void main(String[] args) {
        System.out.println("How many saves did the goalie have? : ");
        Scanner sc = new Scanner(System.in);
        Integer saves = sc.nextInt();
        System.out.println("How many shots against did the goalie have? : ");
        Integer shots = sc.nextInt();
        System.out.println("The goailes save percentage is: " + savePercent(saves,shots)+"%");
        
    
    }

    public static double savePercent(double x, double y){
        return(x/y);

    }
   
}
