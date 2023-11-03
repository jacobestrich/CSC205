//Jacob Estrich - Weekly Homework - Problem 3

//Write a program that helps the user count their change.
//The program should ask how many quarters the user has, then dimes, nickels, and pennies.
//Then the program should tell the user how much money they have in dollars.

//Import Scanner class from Java utils. Enables the scanner class.
import java.util.Scanner;

//Create public class for java file.
public class Problem3 
{
    //Create main class to call future methods in code.
    public static void main(String[] args) 
    {
        //This is the method that will be called that will solve the problem.
        changeCounter();        
    }    

    //This is the mathod that will solve the problem.
    public static void changeCounter()
    {
        //Used the scanner class to enable user input, when prompted. 
        Scanner howMany = new Scanner(System.in);

        //Output a question that asks the user how many quarters they have.
        //Then assign the vairable "Quarters" with the number that the user inputs * 0.25 in a double data type.
        System.out.println("How many quarters do you have?");
        double Quarters = howMany.nextDouble() * 0.25;
        
        //Output a question that asks the user how many dimes they have.
        //Then assign the vairable "Dimes" with the number that the user inputs * 0.10 in a double data type.
        System.out.println("How many dimes do you have?");
        double Dimes = howMany.nextDouble() * 0.10;
        
        //Output a question that asks the user how many nickels they have.
        //Then assign the vairable "Nickels" with the number that the user inputs * 0.05 in a double data type.
        System.out.println("How many nickels do you have?");
        double Nickels = howMany.nextDouble() * 0.05;
        
        //Output a question that asks the user how many pennies they have.
        //Then assign the vairable "Pennies" with the number that the user inputs * 0.01 in a double data type.
        System.out.println("How many pennies do you have?");
        double Pennies = howMany.nextDouble() * 0.01;
        
        //Then assign the variable "totalSum" the value of the sum of the double data types: "Quarters", "Dimes", "Nickels", and "Pennies".
        double totalSum = Quarters + Dimes + Nickels + Pennies;

        //This will output the totalSum value. Utilize the "%.2f" in a formated printf expression to output two decimal places for a good dollar format.
        System.out.printf("Your total sum in dollars is $%.2f", totalSum);

        //Closes the scanner class.
        howMany.close();
    }
}
