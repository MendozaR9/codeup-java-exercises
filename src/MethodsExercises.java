import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
//        ex1();
//        ex2();
        ex4();

    }
    public static void ex1(){
        System.out.println(5+"+"+6+"= "+addition(5, 6));
        System.out.println(6+"-"+5+"= "+subtraction(6, 5));
        System.out.println(5+"*"+5+"= "+multiplication(5,5));
        System.out.println(10 +"/"+5+"= "+division(10,5));
    }

    public static void ex2(){
        System.out.print("Enter a number between 1 and 10: ");
        int userInput = getInteger(1, 10);
    }

    public static void ex4(){
        System.out.print("Enter the number of sides for the dice: ");
        int diceSide = scanner().nextInt();
        System.out.println("First dice is: "+randomNumber(diceSide));
        System.out.println("Second dice is: "+randomNumber(diceSide));
        System.out.println("Do you want to try again? (y/n)");
        String willContinue = scanner().next();
        if (willContinue.equalsIgnoreCase("y")){
            ex4();
        }else {
            System.out.println("bye");
        }

    }

    public static int randomNumber(int maxNum){
        return (int)Math.floor(Math.random()*(maxNum)+1);
    }

    public static Integer addition(int num1, int num2){
        return num1 + num2;
    }
    public static Integer subtraction(int num1, int num2){
        return num1 - num2;
    }
    public static Integer multiplication(int num1, int num2){
        return num1 * num2;
    }
    public static Float division(int num1, int num2){
        return (float)num1 / num2;
    }

    public static int getInteger(int min, int max){
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();
        System.out.println("Your number is: "+userInput);
        if (userInput > min && userInput<max){
            System.out.println(userInput+" is between "+ min+" and "+ max);

            System.out.println("Do you want to continue? (y/n)");
            String willContinue = scanner.next();
            if (willContinue.equalsIgnoreCase("y")){
                factorial(userInput);
            }else {
                System.out.println("bye");
            }

        }else {
            System.out.println(userInput+" is not between "+ min+" and "+ max);
            System.out.print("Enter a number between 1 and 10: ");
            getInteger(1,10);
        }
        return userInput;
    }


    public static void factorial(int num){
        System.out.print(num+"!" +" = ");
        long factNum = 1;
        for (int i = 1; i <= num;i++){
            System.out.print(i+" ");
            factNum = factNum*i;
            if (i < num){
                System.out.print("x ");
            }

        }
        System.out.println("= "+factNum);

        System.out.println("Do you want to continue? (y/n)");
        String willContinue = scanner().next();
        if (willContinue.equalsIgnoreCase("y")){
            ex2();
        }else {
            System.out.println("bye");
        }

    }
    public static Scanner scanner(){
        return new Scanner(System.in);
    }
}
