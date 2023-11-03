import java.util.Scanner;

public class Week2_Monday 
{

    public static void main(String[] args) 
    {
        // int i = 42;
        // //System.out.println(i);
        // int copyi = i;
        // //System.out.println(copyi);
        // copyi = 21;
        // //System.err.println(i);
        // //System.out.println(copyi);

        // Circle circle = new Circle();
        // circle.radius = 10;
        // //System.out.println(circle.radius);
        // Circle circle2 = new Circle();
        // //System.out.println(circle2.radius);
        // circle2.radius = 16;
        // //System.out.println(circle.radius);
        // //System.out.println(circle2.radius);

        // int number1 = 5;
        // int number2 = 5;
        // //System.out.println(number1 == number2);

        // String name = "Jake";
        // String secondName = "Jake";

        // String printText = "name a second name comparison ".concat(secondName);
        // //System.out.println(printText);

        // //System.out.println(name == secondName);
        // //System.out.println(name.equals(secondName));
        // //System.out.println(name.compareTo(secondName));

        // String poem = """
        //         Hello poem
        //         """;
        // //System.out.println(poem);

        // String student_name = "Jake";
        // //System.out.println(student_name);
        // double student_gpa = 3.5;
        // //System.out.println(student_gpa);
        // boolean veteran_status = true; 
        // //System.out.println(veteran_status);
        // int lucky_number = 7;
        // //System.out.println(lucky_number);     
        // student_name = "John";
        // //System.out.println(student_name);   
        // //Cannot convert double to a String
        // String myGpaString = Double.toString(student_gpa);
        // myGpaString = "unkown";
        // //System.out.println(myGpaString);


        // //Ask user to input value, if value is positive, print square root of it. Otherwise, display error message.
        // Scanner stdin = new Scanner(System.in);
        // System.out.print("Enter a value: ");
        // double userInput = Double.parseDouble(stdin.nextLine());
        // if (userInput > 0)
        // {
        //     System.out.println("Square root of the input is: " + Math.sqrt(userInput));
        // }
        // else 
        // {
        //     System.out.println("Error: number is not positive.");
        // }
        // stdin.close();

        // int power = 1;
        // for(int i = 5; i <= 7; i++)
        // {
        //     System.out.println(i + " " + power);
        //     power = 2 * power;
        // }
        RockPaperScissorGame();

        CountOfVowels("Jake");


    }    

    public static void RockPaperScissorGame()
    {
        // //Create Rock, Paper, Sissor game.
        // //Ask user for input and generate a random value. Then output the result
        // Scanner scanner = new Scanner(System.in);
        // // 1 = scissors, 2 = rock, 3 = paper
        // System.out.println("Please enter a number 1 - 3: ");
        // int userInput = scanner.nextInt();
        // int computerInput = (int) (Math.random() * 3) + 1;
        
        // if (userInput == 1 && computerInput == 2) {
        //     System.out.println("Computer won. Rock beats scissors");
        // }
 
        // if (userInput == 1 && computerInput == 3) {
        //     System.out.println("User won. Scissors beats paper");
        // }
 
        // if (userInput == 2 && computerInput == 3) {
        //     System.out.println("Computer won. Paper beats rock");
        // }
 
        // if (userInput == 2 && computerInput == 1) {
        //     System.out.println("User won. Rock beats scissors");
        // }
 
        // if (userInput == 3 && computerInput == 1) {
        //     System.out.println("Computer won. Scissors beats paper");
        // }
 
        // if (userInput == 3 && computerInput == 2) {
        //     System.out.println("User won. Paper beats rock");
        // }
 
        // if ((userInput == 1 && computerInput == 1) ||
        // (userInput == 2 && computerInput == 2) ||
        //         (userInput == 3 && computerInput == 3)) {
        //     System.out.println("Nobody won. There is a tie");
        // }
        // scanner.close();
    }

    public static int CountOfVowels(String word) {
        char[] letters = word.toCharArray();
        int count = 0;
 
        for (int i = 0; i < letters.length; i++) {
            char letter = letters[i];
            if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u') {
                count++;
            }
        }
 
        return count;
    }

}