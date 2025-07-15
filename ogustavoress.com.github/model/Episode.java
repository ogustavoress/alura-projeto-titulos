public class Episode extends Title {
    private int episodeNumber;
    private int season;
    private Series series;

    public Episode(String name, int episodeNumber, int season, Series series, int runningTime) {
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

    public Series getSeries() {
        return series;
    }
    
    @Override
    public String toString() {
        return """
                Name: %s
                Episode number: %d
                Season: %d
                Series: %s
                Running time: %d minutes
                """.formatted(getName(), getEpisodeNumber(), getSeason(), series.getName(), getRunningTime());
    }

}
