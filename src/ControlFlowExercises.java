import java.util.Arrays;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
////        int i =5;
////        while (i  <= 15){
////            System.out.print(i+" ");
////            i++;
////        }
//        for (int i = 5; i <= 15; i++){
//            System.out.print(i+" ");
//        }
//        System.out.println();
//        for (int intdownby5 = 100; intdownby5 >=-10; intdownby5 -=5){
//            System.out.println(intdownby5);
//        }
//
////        int intdownby5 =100;
////        do {
////            System.out.println(intdownby5);
////            intdownby5 -=5;
////        }while (intdownby5 >= -10);
//        System.out.println();
//        for (int squaredof2 =2; squaredof2 <100000; squaredof2 = (int) Math.pow(squaredof2,2)){
//            System.out.println(squaredof2);
//        }
//
////        int squaredof2 = 2;
////        do {
////            System.out.println(squaredof2);
////            squaredof2 = (int) Math.pow(squaredof2,2);
////        }while (squaredof2 < 1000000);

//        for (int frezzbuzz =1; frezzbuzz <=100; frezzbuzz++){
//            System.out.print("["+frezzbuzz+"]");
//            if (frezzbuzz % 3 == 0 && frezzbuzz % 5 ==0) {
//                System.out.print(" FrizzBuzz");
//            }else if (frezzbuzz % 3 ==0){
//                System.out.print(" Frizz");
//            }else if (frezzbuzz % 5==0){
//                System.out.print(" Buzz");
//            }
//            System.out.println();
//        }

        boolean continued;
        do {
            System.out.println("What number would you like to go up to? ");
            String stopingValueString = scanner.next();
            System.out.println("Here is your table!");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            int stopingValue = Integer.parseInt(stopingValueString);
            for (int i = 1; i <= stopingValue; i++) {
                int squared = (int) Math.pow(i, 2);
                int cubed = (int) Math.pow(i, 3);
                System.out.print(i + "      |");
                System.out.print(" " + squared + "       |");
                System.out.println(" " + cubed + "   ");
            }
            System.out.println("Do you want to Continue? (Y/N)");
            String userConinues = scanner.next();
            continued = userConinues.equalsIgnoreCase("y");
        }while (continued);
        System.out.println("ok bye 👋");

    }
}
