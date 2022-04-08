import java.util.Scanner;

public class Highlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int randomNumberOf100 = MethodsExercises.randomNumber(100);
//        System.out.println(randomNumberOf100);
        System.out.print("Guess the number between 1 and 100: ");
        int userGuess = scanner.nextInt();
        if (userGuess == randomNumberOf100){
            System.out.println("GOOD GUESS");
        }else if (userGuess >randomNumberOf100){
            System.out.println("HIGER");
        }else{
            System.out.println("LOWER");
        }
    }
}
