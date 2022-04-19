package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void main(String[] args) {
        Input input = new Input();

        Movie[] movies = MoviesArray.findAll();
        int choice;
        do {
            System.out.println("\nWhat would you like to do");
            System.out.println();
            System.out.println("0 - exit");
            System.out.println("1 - view all movies");
            System.out.println("2 - view movies in the animated category");
            System.out.println("3 - view movies in the drama category");
            System.out.println("4 - view movies in the horror category");
            System.out.println("5 - view movies in the sci-fi category");
            System.out.println();
             choice = input.getInt("Enter your choice: ");
            System.out.println();
            if (choice == 1) {
                for (Movie movie : movies) {
                    System.out.println(movie.getName() + " -- " + movie.getCategory());
                }
            } else if (choice == 2) {
                for (int i = 0; i < MoviesArray.findAll().length; i++) {
                    if (movies[i].getCategory().equals("animated")) {
                        System.out.println(movies[i].getName() + " -- " + movies[i].getCategory());
                    }
                }
            } else if (choice == 3) {
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("drama")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());

                    }
                }
            }else if (choice == 4){
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("horror")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }else if (choice == 5 ){
                for (Movie movie : movies) {
                    if (movie.getCategory().equals("scifi")) {
                        System.out.println(movie.getName() + " -- " + movie.getCategory());
                    }
                }
            }else if (choice == 0){
                break;
            }
            else {
                System.out.println("not a valid input");
            }
        }while (!(choice ==0));
        System.out.println("bye");
    }
}
