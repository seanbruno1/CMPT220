//https://www.w3resource.com/c-programming-exercises/for-loop/c-for-loop-exercises-6.php

/*
The above link has the problem + solution for C, which is similar to java, so it should be a hint if you're struggling. but, complete that problem in Java with a while loop
(your print cannot look like the C solution, organize it differently)
*/
import java.util.Scanner;

public class ExtraLoopPractice{
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Input a number to be calculated: ");
        Integer i =0;
        Integer j = sc.nextInt();
        Integer sum =0;

        for(i = 1;i<=10; i++ ){
            sum = i*j;
            System.out.println(j+ " x " + i+ " = " + sum );
        }







    }
}
