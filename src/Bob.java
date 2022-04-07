import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bob = "Bob: ";
        String respQuestion = bob+"Sure.";
        String respYell =bob+"Whoa, chill out!";
        String respNothing = bob+"Fine. Be that way!😑";
        String respOther = bob+"Whatever.🙄";
        boolean inifinte = true;
        do {
            System.out.print("Tell Bob something:");
            String userinput = scanner.nextLine();
            if (userinput.endsWith("?")) {
                System.out.println(respQuestion);
            } else if (userinput.endsWith("!")) {
                System.out.println(respYell);
            } else if (userinput.isEmpty()) {
                System.out.println(respNothing);
                break;
            } else {
                System.out.println(respOther);
            }
        }while (inifinte);


    }
}
