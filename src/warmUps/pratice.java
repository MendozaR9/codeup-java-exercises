package warmUps;

import java.util.Scanner;

public class pratice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Do you live in Dallas? (y/n)");
        String userlivesInDallas = scanner.next();
        boolean livesInCity;
//        can be simplified, but not to show how it works
        if (userlivesInDallas.equalsIgnoreCase("y")){
            livesInCity = true;
        }else {
            livesInCity = false;
        }

        System.out.println("Do have transport? (y/n)");
        String userHasTranspertaion = scanner.next();
        boolean hasTranpertaion;
//        can be simplified, but it's not to show how it works
        if (userHasTranspertaion.equalsIgnoreCase("y")){
            hasTranpertaion = true;
        }else {
            hasTranpertaion = false;
        }

        boolean canBeInPerson = livesInCity && hasTranpertaion;


        if (canBeInPerson){
            System.out.println("they can come in person");
        }else {
            System.out.println("they can not come in person");
        }
    }
}
