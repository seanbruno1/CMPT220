import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        //P1: This one only prints 0-9, can you fix it so it prints 1-10?
        System.out.println("Problem 1");
        for (int i = 0; i <= 10; i++){ //made i <= to 10
            System.out.println(i);
        }

        //P2: Ask the user for a number. Create a loop to find the factorial of it
        //(factorial = X!, X being the user input, Factorials are every digit before X multiplied together)
        System.out.println("Problem 2");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number and I will tell you the fatorial: ");
        Integer num = sc.nextInt();
        Integer sum5 = 1;
        //here's a hint
        for (int i = 1; i <= num; i++){
            sum5 *= i; // changed this to *= so i keeps multiplying to the previous number
            
        }

        System.out.println(sum5);

     

        
        

        //P3: Ask the user for a number, and then add together every OTHER digit (starting from 1)
        System.out.println("Problem 3");
        System.out.println("Enter a number and I will tell you the sum of every other number: ");

        String num4 = sc.next(); 
        int sum3 = 0;

        // Iterate over every other digit starting from index 0
        for (int i = 0; i < num4.length(); i += 2) { // had to google how to find the length of a string
            sum3 += Character.getNumericValue(num4.charAt(i)); // had to google how to change a string into an integer, then also found how to breakup string into characters.
        }

        System.out.println(sum3); 

        

    
        //No hint! what do you need to complete this task?
        // Needed to receive number in a string then break it up and convert to integer


        //P4: Why does this loop never stop!
        //what can you do to break out of the loop after it prints once?
        System.out.println("Problem 4");
        boolean run = true;
        while (run == true){
            System.out.println("I printed once!");
            run = false; // made run = false so loop wouldnt run
        }

        //P5: Take a string from the user and print them the reverse!
        System.out.println("Problem 5");
        System.out.println("Please provide a string");
        String input = sc.nextLine();
        //hint
        String reverse = ""; // this makes the var reverse empty

        for (int i = input.length() - 1; i >= 0; i--) { 
            reverse += input.charAt(i); // adds the characters backwards into reverse var
        }

        
        System.out.println(reverse);

        
    }

    

}


    

