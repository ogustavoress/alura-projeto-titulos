import java.util.ArrayList;

public class MainFavoritesList {

    public static void main(String[] args) {
        
        Movie movie1 = new Movie("Ocean's 8", 2018);
        Movie movie2 = new Movie("The House with a Clock in Its Walls", 2018);

        Series series1 = new Series("The Big Bang Theory", 2007);
        Series series2 = new Series("The Black List", 2013);
        
        Episode episode24S9 = new Episode("The Proposal Proposal", 24, 9, series1, 21);
        Episode episode21S4 = new Episode("Mr. Kaplan", 21, 4, series2, 45);

        ArrayList<Title> favoritesList = new ArrayList<>();
        favoritesList.add(movie1);
        favoritesList.add(movie2);
        favoritesList.add(series1);
        favoritesList.add(series2);
        favoritesList.add(episode24S9);
        favoritesList.add(episode21S4);


        for (Title title : favoritesList) {
            System.out.println(title);
        }

    }

}
