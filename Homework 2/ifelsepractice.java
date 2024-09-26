//always start with importing our scanner so we can use it!
import java.util.Scanner;


/* our first practice file!
* create a 3 question quiz game (lots of if/else likely)
* requirements: keep track of the user's score, has to have at least 3 questions, use if/else
* can be any topic you pick :) feel free to pick some obscure or niche topics!
* good luck!
* */
public class ifelsepractice {
    public static void main(String[] args) {

        //Math Quiz game

        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the math quiz game!");
        System.out.println("1. What is 9x8 ?");
        Integer ans1 = sc.nextInt();
        Integer score = 0;

        if(ans1 == 72){
            System.out.println("You are correct!");
            score++;
        }else{
            System.out.println("You are wrong!");
        }

        System.out.println("2. What is 19+37?");
        Integer ans2 = sc.nextInt();

        if(ans2 == 56){
            System.out.println("You are correct!");
            score++;
        } else{
            System.out.println("You are wrong.");
        }

        System.out.println("3. What is 21x3 ?");
        Integer ans3 = sc.nextInt();

        if(ans3 == 63){
            System.out.println("You are correct!");
            score++;
        } else{
            System.out.println("You are wrong");
        }

        System.out.println("Thank you for playing!");
        System.out.println("Your final score is: " + score);




    }
}


