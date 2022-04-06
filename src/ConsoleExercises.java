import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s \n", pi);

        Scanner scanner = new Scanner(System.in);

//        System.out.print("\nEnter number: ");
//        int userInput = scanner.nextInt();
//        System.out.println("You entered: --> " + userInput + " <--");

        System.out.print("\nEnter a word: ");
        String firstword = scanner.next();
        System.out.print("\nEnter a word: ");
        String secondword = scanner.next();
        System.out.print("\nEnter a word: ");
        String thirdword = scanner.next();
        scanner.nextLine();
        System.out.println("First word is \""+firstword+"\"");
        System.out.println("Second word is \""+secondword+"\"");
        System.out.println("Third word is \""+thirdword+"\"");

        System.out.println("Enter a Sentence:");
        String sentence = scanner.nextLine();
        System.out.printf("%s\n", sentence);


        System.out.println("Enter the length: ");
        String length = scanner.nextLine();
        System.out.println("Enter the width");
        String width = scanner.nextLine();

        float intLength = Float.parseFloat(length);
        float intWidth = Float.parseFloat(width);

        System.out.println("The Area is "+ intLength * intWidth);
        System.out.println("The Perimeter is " + (intLength*2 + intWidth*2));
    }
}
