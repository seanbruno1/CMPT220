import java.util.Scanner;

public class loops{
    public static void main(String[] args){

        //i= i+2; i+=2
        for(int i = 0; i<=5; i+=2){
            System.out.println(i);
        }

        // Pasue and play print name 20 times
        String name = "Sean";

        for(int i = 0; i<20; i++){
            System.out.println(name);
        }

        //While loop 
        boolean playgaming = true;
        while(playgaming == true){
            System.out.println("Playing Game!");
            playgaming = false;
        }

        //Pause and play print the first 10 numbers using while loops
        int i = 0;
        while(i <= 10){
            System.out.println(i);
            i++;
        }

        // Pause and play: Print the var p equal to your name and print 4 times using while loop

        String p = "Sean";
        int t = 1;

        while(t <= 4){
            System.out.println(p);
            t++;

        }

        //Pause and play: Infinite loop

        //boolean school = true;
        //while(school == true){
        //    System.out.println("cmpt220");
       // }

       //Pause and play for loops, add 1+2+3....+n = sum // ask user for number.

       //Scanner sc = new Scanner(System.in);
       //System.out.println("Please provide a number: ");
       //Integer num = sc.nextInt();
       

       int sum = 0;
       int v = 1;

       //while(v<num){
        //sum = sum+v;
        //i++;
      // }
       //for(int s = 1; s <= num; s++){
        //sum = sum +s;
       //}
       //System.out.println(sum);

       //Pause and play countdown

       int x = 10;

       while(x >= 1){
        System.out.println(x);
        x--;
       }

       

       for(int w = 10;w>=1;w--){
        System.out.println(w);
       }

       //Pause and play password

       Scanner sc = new Scanner(System.in);
       System.out.println("Password: ");
       String guess = sc.nextLine();
       String password = "code";

       while(!guess.equals(password)){
        System.out.println("Wrong password");
        guess = sc.nextLine();
       }
       System.out.println("Correct!");

       //Pause and play number

       System.out.println("Please provide a number");

       Integer num = sc.nextInt();
       int sum1 = 0;

       while(num>=0){
        sum1 += num;
        System.out.println("Enter again");
        num = sc.nextInt();
       }

       System.out.println(sum1);

       // Star array

       for(int k =1; k < 7; k++){
        for(int y=1; y<= 5; y++){
            System.out.print("*");
        }
        System.out.println();
       }

       // clock
       for(int a = 0; a <= 24; a++){
        System.out.println("Hour:"+ a);
        for(int g = 0; g <= 60;g++ ){
            System.out.println("Minute:" + g);
        }
        
       }

       
       

       

        
    }

   
    
}