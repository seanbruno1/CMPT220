
public class Main {
    public static void main(String[] args) {

        //for this section: are these all printing the best option? If they aren't, fix it!
        //(However you interpret 'fix' is fine i promise, any way you fix it shows you get the concept to me)
        int var1 = 4;
        if (var1 > 4){
            System.out.println("Var1 is greater than 4");
        }else if(var1 == 4){
            System.out.println("Var 1 is equal to 4");
        }
        else{
            System.out.println("Var1 is less than 4");
        }

        // fixed var 1 by adding a else if for if var 1 == 4

        int var2 = 6;
        if (var2 == 5){
            System.out.println("Var2 is 5");
        } else if (var2 > 5){
            System.out.println("Var2 is greater than 5");
        } else{
            System.out.println("Var2 is less than 5");
        } 

        //For var 2 I fixed by getting rid of var2 == 6 I thought it was unessasary

        int var3 = 5;
        if (var3 > 10){
            System.out.println("Var3 is greater than 10");
        } else if(var3 == 10){
            System.out.println("Var3 is equal to 10");
        }else {
            System.out.println("Var3 is less than 10");
        }

        //For var 3 I made a line if it is equal to 10




        //for this section: why are we not entering the if statement?

        // Before the it was ("Marist" == "marist") which these are not equal and you need a variable. 
        //So I created a string named college and used that for the outputs.

        String college = "Marist";
        if (college == "Marist"){
            System.out.println("Marist college!");
        } else{
            System.out.println("Not marist college :(!");
        }


    }
}
