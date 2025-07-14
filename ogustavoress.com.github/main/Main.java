import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Movie> movies = new ArrayList<>();

        Movie movie1 = new Movie("Ocean's 8", 2018);
        movie1.setGenre("Comedy/Crime");
        movie1.setRunningTime(151);
        movie1.setProducedBy("Gary Ross");
        movies.add(movie1);

        Movie movie2 = new Movie("The House with a Clock in Its Walls", 2018);
        movie2.setGenre("Family/Fantasy");
        movie2.setRunningTime(105);
        movie2.setProducedBy("John Bellairs");
        movies.add(movie2);

        System.out.println("MOVIES");
        System.out.println(movies);

    }
}
