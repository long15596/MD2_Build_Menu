package dto;

import models.Album;
import models.Song;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ReadAndWrite {
    public void WriteSongData(List<Song> songList) {

        try {
            File file = new File("AlbumManager/data/dataSong.csv");
            BufferedWriter bufferedWriterSong = new BufferedWriter(new FileWriter(file));
            for (Song song: songList) {
                bufferedWriterSong.write(song.getSongId() + " , " +
                        song.getSongName() + " , " +
                        song.getArtist() + " , " +
                        song.getMusicGenres());
            }
        } catch (IOException e) {
            String message = e.getMessage();
            System.out.println(message);
        }
    }
    public void WritAlbumData(List<Album> albumList) {
        File file = new File("AlbumManager/data/dataAlbum.csv");
        try {
            BufferedWriter bufferedWriterAlbum = new BufferedWriter(new FileWriter(file));
            for (Album a: albumList) {
                for (Song s: a.getAlbum()) {
                    bufferedWriterAlbum.write(a.getIdAlbum() + " , " +
                            a.getAlbumName() + " , " +
                            s.getSongId() + " , " +
                            s.getSongName() + " , " +
                            s.getArtist() + " , " +
                            s.getMusicGenres());
                }
            }
        } catch (IOException e) {
            String massage = e.getMessage();
            System.out.println(massage);
        }
    }
    public List<String[]> ReadFile(String linkFile) {
        List<String[]> listData = new ArrayList<>();
        try {
            File file = new File(linkFile);
            if (!file.exists()) {
                throw new FileNotFoundException();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                listData.add(line.split(" , "));
            }
        } catch (IOException e) {
            String message = e.getMessage();
            System.out.println(message);

        }
        return listData;
    }
}
