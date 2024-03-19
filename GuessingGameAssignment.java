package codingAssignment;
/*
PROJECT DETAILS
Project Title: Guessing Game Coding Assignment - ICS3U Coding Assignment #3
Project Description: This program is a guessing game where the computer generates a random number between 1 and 20. The player has 10 opportunities to guess the number
and will be given hints about whether the number they guessed is higher or lower than the actual number. If the player does not guess the correct value in 10 guesses,
they will receive a message that they have failed to do so and the program will terminate. If they guess the computer's number in 10 guesses or under, they receive a message that they have guessed
the number correctly and a line about how many guesses they took to get the right answer.
Name: Suhani Surya
Date: May 1st - May 2nd, 2023
 */

//IMPORTING NECESSARY CLASSES
import java.util.Scanner; //This statement imports the scanner class from the java utilities package. This is so that the program can receive input from the user.

import java.util.Random; //This statement imports the random class from the java utilities package. This is for the program to generate random numbers.

//CLASS HEADER
public class GuessingGameAssignment //This is the class header called "GuessingGameAssignment"
{
    public static void main(String[] args) //This is the main method header, indicating that this is a public method
    {
        //INITIALIZING OBJECTS THAT WERE PREVIOUSLY IMPORTED
        Scanner saf = new Scanner(System.in); //This statement initializes the scanner object named saf. This scanner object receives input from the console
        Random rand = new Random();//This statement initializes the random object named rand.


        //VARIABLE DECLARATION AND INITIALIZATION
        int number = rand.nextInt(20) + 1; //This is an integer data type variable named number, which uses the random class to generate a number between 1 and 20
        //This format was done because without the +1, the computer would generate a random number from 0 - 19.By adding the one, it guarantees that the number will not be 0 and be between 1 and 20 (inclusive)
        int guess; //This is an integer data type variable named guess which stores the integer that the user will enter as their guess
        int numOfGuessesLeft = 10; //This is an integer data type variable named numOfGuessesLeft, which keeps track of the attempts the user can have at guessing the number
        int numOfGuesses = 1; //This is an integer data type variable named numOfGuesses which stores the attempt that the user is on when they guess the number


        //BEGINNING OF PROGRAM
        System.out.println("The computer has guessed a number from 1 to 20"); //This statement prints the basic information that tells the user that the computer has generated a random number between 1 and 20
        System.out.println("You have " + numOfGuessesLeft + " guesses left.");//This statement prints how many guesses the user has, taking that value from the numOfGuessesLeft variable
        System.out.print("\nGuess a number: ");//This statement offers a prompt for the player to enter a guess
        guess = saf.nextInt();//This statement assigns the user's input to the variable named guess.


        //WHILE LOOP BEGINS HERE
        while(guess != number && numOfGuessesLeft > 1) //This is a while loop which has the conditions that the number entered by the user does not equal the computer's number
        {                                              //The other condition is that the number of guesses left is above 1. If both of these conditions are true, the program will execute the code block
            numOfGuessesLeft--; //The number of guesses left will decrement by 1.This positioning was intentional as the number of remaining guesses needs to be immediately updated and printed in the following conditional statements
            //This statement assigns the user's input to the variable named guess.
            if(guess > number) //This is a conditional statement that if the player's guess is higher than the computer's number to execute the following code block
            {
                System.out.print("Too high, you have " + numOfGuessesLeft + " guesses left, guess again: "); //This statement prints in the console that the guess was too high, tells the player how many guesses they have left and to try again
            }
            else//This statement will execute if the player's guess is lower than the computer randomly generated number
            {
                System.out.print("Too low, you have " + numOfGuessesLeft + " guesses left, guess again: ");//This statement prints in the console that the guess was too low, tells the player how many guesses they have left and to try again
            }
            guess = saf.nextInt();//This statement assigns the user's input from the console to the variable named guess.

            numOfGuesses++;//This statement increments the number of guesses that the user has used
        } //end of loop


        //BREAKING OUT OF THE LOOP
        //The 3 ways the player would break out of this loop is if their number is not equal to the computer's number or
        //the second way is if the number of remaining attempts of numOfGuessesLeft is 1 or less
        //The third way is if both conditions were false
        //This leads the program to go through one last conditional statement which occurs on attempt #10


        //CONDITIONAL STATEMENT FOR THE LAST ATTEMPT
        if(guess != number) //This is a conditional if statement that has the condition that the guess is not equal to the computer's number. In this case, the following code block would execute.
        {
            System.out.println("\nYou have failed to guess the number.");//This statement prints that the player was not successful in guessing the number
        }
        else //If the player guesses the number that matches the one the computer generated, the following code block will execute.
        {
            System.out.println("\nYou guessed correctly!"); //This statement tells the player that they have guessed correctly. There is a \n to follow the sample output
            System.out.println("It took you " + numOfGuesses + " guesses.");//This statement tells the player that they took a certain amount of guesses to get the correct number
            //This variable is the numOfGuesses, that was accumulating over the course of the while loop
        }

        saf.close();//This statement closes the scanner object so that it does not waste any memory and space

    }
}





