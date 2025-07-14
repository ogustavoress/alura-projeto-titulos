public class Series extends Title {

    public Series(String name, int releaseYear, String genre, int runningTime, String producedBy){
        super(name, releaseYear);
    }

    @Override
    public String toString() {
        return """
                Series: %s
                Release Year: %d
                Genre: %s
                Running time: %d minutes
                Produced by: %s
                """.formatted(getName(), getReleaseYear(), getGenre(), getRunningTime(), getProducedBy());
    }
}
