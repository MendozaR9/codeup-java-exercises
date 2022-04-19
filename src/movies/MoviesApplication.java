package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();


        int choice;
        do {
            menu();
            choice = input.getInt("Enter your choice: ");
            System.out.println();
            if (choice ==0){
                break;
            }
            enterChoice(choice);

        }while (!(choice ==0));
        System.out.println("bye");
    }

    public static void menu(){
        System.out.println("\nWhat would you like to do");
        System.out.println();
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the sci-fi category");
        System.out.println();

    }

    public static void enterChoice(int choice){
        Movie[] movies = MoviesArray.findAll();
        if (choice == 1) {
            for (Movie movie : movies) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        } else if (choice == 2) {
            movieCategory("animated", movies);

        } else if (choice == 3) {
            movieCategory("drama", movies);

        }else if (choice == 4){

            movieCategory("horror", movies);

        }else if (choice == 5 ){
            movieCategory("scifi", movies);
        }
        else {
            System.out.println("not a valid input");
        }
    }

    public static void movieCategory(String category, Movie[] movies){
        for (Movie movie : movies) {
            if (movie.getCategory().equals(category)) {
                System.out.println(movie.getName() + " -- " + movie.getCategory());
            }
        }
    }
}
