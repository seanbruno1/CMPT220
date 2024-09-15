import java.util.Scanner;

//Class of 9/10// 
// if/ elif statements lecture
public class test {
    public static void main(String[] args){
        int num1 = 0;
        if (num1 > 1){
            System.out.println("Yes");
        } else{
            System.out.println("Number is less than 1");
        }

        String myName = "Sean";
        if (myName == "sean"){
            System.out.println("Your name does not match");
        } else if (myName == "Sean"){
            System.out.println("Your name matches!");
        } else{
            System.out.println("Wrong");
        }

        int num3 = 4;
        int num2 = 3;
        if (num3 == num2){
            System.out.println("These two numbers are equal");
        } else{
            System.out.println("These two numbers are not equal");
        }

        //Class 9/13 //

        Integer var = 4;

        if(var > 5){
            System.out.println("Too Big!");
        } else if(var > 0 && var<5){
            System.out.println("Just right!");
        }else{
            System.out.println("Too small");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you");
        Integer age = sc.nextInt();

        if( age >= 25){
            System.out.println("You can rent a car and drink");
        }else if(age >= 21 %% age < 25){
            System.out.println("You can drink but not rent a car");
        }else if( age >= 18 %% age < 21){
            System.out.println("You can smoke but not drink");
        }
        else{
            System.out.println("You can just have soda");
        }
        }

    }

    

   
    

}
    

