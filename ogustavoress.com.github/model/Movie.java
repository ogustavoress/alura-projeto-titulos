public class Movie extends Title{
    
    public Movie(String name, int releaseYear, String genre, int runningTime, String producedBy){
        super(name, releaseYear);
    } 

    @Override
    public String toString() {
        return """
                Movie: %s
                Release Year: %d
                Genre: %s
                Running time: %d minutes
                Produced by: %s
                """.formatted(getName(), getReleaseYear(), getGenre(), getRunningTime(), getProducedBy());
    }
}
