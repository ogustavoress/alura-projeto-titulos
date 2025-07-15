import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        ArrayList<Movie> moviesList = new ArrayList<>();

        Movie movie1 = new Movie("Ocean's 8", 2018);
        movie1.setGenre("Comedy/Crime");
        movie1.setRunningTime(151);
        movie1.setProducedBy("Gary Ross");
        moviesList.add(movie1);

        Movie movie2 = new Movie("The House with a Clock in Its Walls", 2018);
        movie2.setGenre("Family/Fantasy");
        movie2.setRunningTime(105);
        movie2.setProducedBy("John Bellairs");
        moviesList.add(movie2);

        ArrayList<Series> seriesList = new ArrayList<>();
        Series series1 = new Series("The Big Bang Theory", 2007);
        series1.setGenre("Comedy");
        series1.setSeasons(12);
        series1.setEpisodesPerSeason(23);
        series1.setMinutesPerEpisode(21);
        series1.setProducedBy("James Burrows e Mark Cendrowski");
        seriesList.add(series1);

        Series series2 = new Series("The Black List", 2013);
        series2.setGenre("Drama/Crime");
        series2.setSeasons(80);
        series2.setEpisodesPerSeason(22);
        series2.setMinutesPerEpisode(43);
        series2.setProducedBy("Joe Canahan");
        seriesList.add(series2);

        ArrayList<Episode> episodesList = new ArrayList<>();
        Episode episode24S9 = new Episode("The Proposal Proposal", 24, 9, series1, 21);
        episodesList.add(episode24S9);

        Episode episode21S4 = new Episode("Mr. Kaplan", 21, 4, series2, 45);
        episodesList.add(episode21S4);
        
        System.out.println("=====================================================");
        System.out.println("MOVIES");
        System.out.println(moviesList);
        System.out.println("=====================================================");
        System.out.println("SERIES");
        System.out.println(seriesList);
        System.out.println("=====================================================");
        System.out.println("EPISODES");
        System.out.println(episodesList);


    }
}
