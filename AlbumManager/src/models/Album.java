package models;

import java.util.List;

public class Album {
    private int idAlbum;
    private String albumName;
    private List<Song> album;
    private int idAlbumIncrement = 1;
    public Album(String albumName, List<Song> album) {
        this.idAlbum = idAlbumIncrement;
        this.albumName = albumName;
        this.album = album;
        idAlbumIncrement++;
    }

    public int getIdAlbum() {
        return idAlbum;
    }

    public void setIdAlbum(int idAlbum) {
        this.idAlbum = idAlbum;
    }

    public String getAlbumName() {
        return albumName;
    }

    public void setAlbumName(String albumName) {
        this.albumName = albumName;
    }

    public List<Song> getAlbum() {
        return album;
    }

    public void setAlbum(List<Song> album) {
        this.album = album;
    }
    public void addSongToAlbum(Song song) {
        this.album.add(song);
    }
    @Override
    public String toString() {
        return "Id Album: " + idAlbum +
                " Album Name='" + albumName + '\'' +
                " Song List=" + album;
    }
}
