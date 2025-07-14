public class Episode extends Title {
    private int episodeNumber;
    private int season;
    private String series;

    public Episode(String name, int episodeNumber, int season, String series, int runningTime) {
        super(name, runningTime);
        this.episodeNumber = episodeNumber;
        this.season = season;
        this.series = series;

    }

    public int getEpisodeNumber() {
        return episodeNumber;
    }

    public int getSeason() {
        return season;
    }

    public String getSeries() {
        return series;
    }
    
    @Override
    public String toString() {
        return """
                Name: %s
                Episode number: %d
                Season: %d
                Running time: %d minutes
                """.formatted(getName(), getEpisodeNumber(), getSeason(), getRunningTime());
    }

}
