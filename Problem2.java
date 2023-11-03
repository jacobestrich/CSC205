//Jacob Estrich - Weekly Homework - Problem 2

//Write a program that asks the user's name, and then greets the user by name.
// Before outputting the user's name, convert it to upper case letters.

//Import the Scanner class from java utils.
import java.util.Scanner;

//Create class for java file.
public class Problem2 
{
    //Create main method to call upon future methods.
    public static void main(String[] args) 
    {
        //This will call the "Greeting" method.
        Greeting();
    }    

    //Create the Greeting method to solve the problem.
    public static void Greeting()
    {
        //Set up the scanner class to be the variable "userName" This will assign a value to the variable "userName" to whatever the user inputs.
        Scanner userName = new Scanner(System.in);

        //Output a question to the user. This asks the user what their name is. A new line is created for the user to input.
        System.out.println("What is your name?");

        //This assigns the variable userInput to the value of userName.
        String userInput = userName.next();

        //This will print out or display the final string needed for the problem. 
        //A combination of Strings being added together to form a formated String. 
        //The "".toUpperCase" extension to the userInput variable, will make all characters upper case, as needed for the problem.
        System.out.println("Hello, " + userInput.toUpperCase() + " nice to meet you!");
        
        //This closes the scanner class.
        userName.close();
    }

}
