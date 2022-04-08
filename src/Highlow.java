import java.util.Scanner;

public class Highlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int randomNumberOf100 = MethodsExercises.randomNumber(100);
//        System.out.println(randomNumberOf100);
        int guessAttemps=0;
        int guesslimit = 10;
        do {
            System.out.print("Guess the number between 1 and 100: ");
            int userGuess = scanner.nextInt();
            guessAttemps++;
            if (userGuess == randomNumberOf100) {
                System.out.println("GOOD GUESS");
                break;
            } else if (userGuess > randomNumberOf100) {
                System.out.println("LOWER");
            } else {
                System.out.println("HIGER");
            }
        }while (guessAttemps < guesslimit);
        System.out.println("The Number was: "+ randomNumberOf100);
        System.out.println("Amount of attempts: " + guessAttemps);
    }
}
