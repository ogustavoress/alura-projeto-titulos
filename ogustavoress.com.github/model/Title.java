public class Title {
    private String name;
    private int releaseYear;
    private String genre;
    private int runningTime;
    private String producedBy;

    public Title(String name, int releaseYear, String genre, int runningTime, String producedBy) {
        this.name = name;
        this.releaseYear = releaseYear;
        this.genre = genre;
        this.runningTime = runningTime;
        this.producedBy = producedBy;
    }

    public String getName() {
        return name;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public String getGenre() {
        return genre;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public String getProducedBy() {
        return producedBy;
    }

    @Override
    public String toString() {
        return """
                Name: %s
                Release Year: %d
                Genre: %s
                Running time: %d minutes
                Produced by %s
                """.formatted(name, releaseYear, genre, runningTime, producedBy);
    }

}
