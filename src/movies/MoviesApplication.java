package movies;

import util.Input;

import java.util.Arrays;

public class MoviesApplication {
    public static void movieApp() {
        boolean willRun = true;
        Movie[] movieArray = MoviesArray.findAll();
        Input sc = new Input();
//        while (willRun){
//            System.out.println("Please make your selection");
//            System.out.println("0 - Exit");
//            System.out.println("1 - See all movies");
//            System.out.println("2 - See all musical movies");
//            System.out.println("3 - See all drama movies");
//            System.out.println("4 - See all horror movies");
//            System.out.println("5 - See all sci-fi movies");
//            System.out.println("6 - Add movie to list");
//            int num = sc.getIntegerSecret(0, 7);
//            switch (num) {
//                case (0):
//                    System.out.println("Are you sure you want to quit?");
//                    sc.clear();
//                    boolean confirm = sc.yesNo();
//                    if (confirm) {
//                        System.out.println("Closing program...");
//                        willRun = false;
//                        break;
//                    } else {
//                        System.out.println("Restarting...");
//                        break;
//                    }
//                case (1):
//                    for (Movie movie : movieArray) {
//                        System.out.println(movie.getName() + " --- " + movie.getCategory());
//                    }
//                    break;
//              ;
//                    break;
//                default:
//                    System.out.println("working on it...");
//                    break;
//            }
//        }
//    }
//
//    private static Movie[] addMovie(Movie[] movies, Movie movie){
//        movies = Arrays.copyOf(movies, movies.length + 1);
//        movies[movies.length - 1] = movie;
//        return movies;
//    }

//    public static void main(String[] args) {
//        movieApp();
    }}


