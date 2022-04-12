package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner =new Scanner(System.in);

    public static void  main (String[] args) {
        Input input = new Input();
        Input input2 = new Input();
        input.yesNo();
        System.out.println("Enter a number between 1 and 10");
        input2.getDouble(1,10);
    }
    public Input(){

    }
    //methods
    public String getString(){
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        String testSting = getString();
        if (testSting.equalsIgnoreCase("y")||testSting.equalsIgnoreCase("yes")){
            System.out.println(true);
            return true;
        }else {
            System.out.println(false);
            return false;
        }

    }
    public int getInt(int min, int max){
        int input = getInt();
        if (min < input && input < max){
            System.out.println(input+ " is a number between "+min+" and "+max);
            return input;
        }else {
         return getInt(min, max);
        }
    }
    public int getInt(){
        return this.scanner.nextInt();
    }
    public double getDouble(double min, double max){
        double input = getDouble();
        if (min<input && input<max){
            System.out.println(input+ " is a number between "+min+" and "+max);
            return input;
        }
        else {
            return getDouble(min, max);
        }
    }
    public double getDouble(){

        return this.scanner.nextDouble();
    }
}
