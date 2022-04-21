package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;


    public Input(){
    this.scanner= new Scanner(System.in);
    }
    //methods
    public String getString(){
        return this.scanner.nextLine();
    }
    public boolean yesNo(){
        String testSting = getString();
        if (testSting.equalsIgnoreCase("y")||testSting.equalsIgnoreCase("yes")){

            return true;
        }else {

            return false;
        }

    }
    public int getInt(int min, int max){
        int input = this.scanner.nextInt();
        if (min < input && input < max){
            System.out.println(input+ " is a number between "+min+" and "+max);
            return input;
        }else {
         return getInt(min, max);
        }
    }

    public int getInt(String prompt){
        System.out.print(prompt);
        try {
            return Integer.parseInt(getString());
        }catch (NumberFormatException e){
            System.out.println("Not a valid number");
            return getInt(prompt);
        }
    }

    public double getDouble(double min, double max){
        double input = this.scanner.nextDouble();
        if (min<input && input<max){
            System.out.println(input+ " is a number between "+min+" and "+max);
            return input;
        }
        else {
            return getDouble(min, max);
        }
    }

    public double getDouble(String prompt){
        System.out.print(prompt);
        try {
            return Double.parseDouble(getString());
        }catch (NumberFormatException e){
            return getDouble(prompt);
        }
    }
}
