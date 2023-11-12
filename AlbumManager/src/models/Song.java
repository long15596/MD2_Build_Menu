package models;

public class Song {
    private int songId;
    private int songIdIncrement = 1;
    private String songName;
    private String artist;
    private String musicGenres;

    public Song(String songName, String artist, String musicGenres) {
        this.songId = songIdIncrement;
        this.songName = songName;
        this.artist = artist;
        this.musicGenres = musicGenres;
        songIdIncrement++;
    }

    public int getSongId() {
        return songId;
    }

    public void setSongId(int songId) {
        this.songId = songId;
    }

    public String getSongName() {
        return songName;
    }

    public void setSongName(String songName) {
        this.songName = songName;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getMusicGenres() {
        return musicGenres;
    }

    public void setMusicGenres(String musicGenres) {
        this.musicGenres = musicGenres;
    }

    @Override
    public String toString() {
        return "Song Id: " + songId +
                " Song Name: '" + songName + '\'' +
                " Artist: '" + artist + '\'' +
                " Music Genres: '" + musicGenres + '\'';
    }
}
