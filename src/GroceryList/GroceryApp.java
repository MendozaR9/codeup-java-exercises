package GroceryList;

import util.Input;

import java.util.HashMap;
import java.util.Set;

public class GroceryApp {
    public static void main(String[] args) {
        startApp();
    }
    public static void startApp(){
        Input input = new Input();
        System.out.println("would you like to create a grocery list?");
        Boolean confirm = input.yesNo();
        System.out.println(confirm);
        category(input);
    }
    public static int category(Input input){
        System.out.println("Pick a Category");
        System.out.println("1:Dairy");
        System.out.println("2: Vegetable");
        System.out.println("3: Fruit");
        System.out.println("4: Meat");
        int choice = Integer.parseInt(input.getString());

        if (checkCat(choice)){
            return choice;
        }else return 0;
    }
    public static boolean checkCat(int choice){
        if (choice == 1 || choice ==2 || choice ==3 || choice ==4){
            return true;
        }else return  false;

    }
}
