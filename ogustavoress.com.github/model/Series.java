public class Series extends Title {
    private int seasons;
    private int episodesPerSeason;
    private int minutesPerEpisode;

    public Series(String name, int releaseYear) {
        super(name, releaseYear);
    }

    public int getSeasons() {
        return seasons;
    }

    public void setSeasons(int seasons) {
        this.seasons = seasons;
    }

    public int getEpisodesPerSeason() {
        return episodesPerSeason;
    }

    public void setEpisodesPerSeason(int episodesPerSeason) {
        this.episodesPerSeason = episodesPerSeason;
    }

    public int getMinutesPerEpisode() {
        return minutesPerEpisode;
    }

    public void setMinutesPerEpisode(int minutesPerEpisode) {
        this.minutesPerEpisode = minutesPerEpisode;
    }

    @Override
    public String toString() {
        return """
                Series: %s
                Release Year: %d
                Genre: %s
                Seasons: %d
                Episodes per season: %d
                Minutes per episode: %d
                Produced by: %s
                """.formatted(getName(), getReleaseYear(), getGenre(), getSeasons(), getEpisodesPerSeason(), getMinutesPerEpisode(), getProducedBy());
    }
}
