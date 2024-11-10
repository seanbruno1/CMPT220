//This is assuming you have your file in the correct directory, i included a reference of where your txt file should be in the brightspace assignment
//based off what we learned in class about files, you need to determine how it's best to read the text file included in the assignment 
//after you've read and kept track of the text, then i need you to figure out:
/*
1. what names had over a 3.5 gpa (using coding, of course, not your eyes)
2. how many names are there total?
*/
//here's the imports you will need to start, and i've left some code with some blanks for you to figure out
import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //do you need something to start?
        File inputfile = new File("practice.txt");
        List<String> names = new ArrayList<>(); //make array lists for gpa and names
        List<Double> gpas = new ArrayList<>();

        try {
            Scanner input = new Scanner(inputfile); 
            while (input.hasNextLine()) {
                //what do we do at every line of the file?
                if (input.hasNextLine()) {
                    String name = input.nextLine(); 
                    names.add(name);
                }

                if (input.hasNextLine()) {
                    double gpa = Double.parseDouble(input.nextLine());
                    gpas.add(gpa);
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

    
        List<String> over3_5 = new ArrayList<>();
        for (int i = 0; i < gpas.size(); i++) { 
            if (gpas.get(i) > 3.5) {
                over3_5.add(names.get(i));
            }
        }

        
        int totalNames = over3_5.size(); 


        System.out.println("Names with  a GPA over 3.5: " + over3_5);
        System.out.println("Total number of names with a 3.5: " + totalNames);
    }
}

