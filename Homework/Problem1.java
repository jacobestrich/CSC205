//Jacob Estrich - Weekly Homework - Problem 1

//Write a program that simulates rolling a pair of dice.
//You can simulate rolling one die by choosing one of the integers 1, 2, 3, 4, 5, or 6 at random
//The number you pick represents the number on the die after it is rolled. 
//Do this twice and add the results together to get the total roll. 
//Program should report the number showing on each die as well as the total roll. EX:
//The first die comes up 3
//The second die comces up 5
//Your total roll is 8

//Created my class to start my Java file. The Class name needs to match my filename exactly for the file to function.
public class Problem1 
{
    //Created the main method for my class. This method will call up the future methods that actually solve the problem.
    public static void main(String[] args) 
    {
        Sum();
    }
    //I am calling this method Sum. However, this method will complete all the functions I need to solve the problem.
    public static void Sum()
    {
        //These next two lines of code are to set up each die cast. I have created two variables, called "die1" and "die2".
        //These two variables are assigned the value of the output of the "(int)(Math.random()*6+1)" expression, which will generate a random number 1-6
        int die1 = (int)(Math.random()*6+1);
        int die2 = (int)(Math.random()*6+1);

        //This next line of code will that the two values generated above and add them together, which will create the sum for both dice.
        int sum = die1 + die2;

        //I then creat three lines of code that will output these values. Once called by the main method, they will be displayed in the console.
        //Theses outputs also combine a string plus the value of die1 and die2. This way the output is formated better for the user. 
        System.out.println("The first die comes up " + die1);
        System.out.println("The second die comes up " + die2);
        System.out.println("Your total roll is " + sum);
    }

}