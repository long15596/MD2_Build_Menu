package models;

import java.util.List;

public class User {
    private int userId;
    private String name;
    private String userAccount;
    private String userPassword;
    private List<Album> albumList;
    private int userIdIncrement = 1;

    public User(String name, String userAccount, String userPassword, List<Album> albumList) {
        this.name = name;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
        this.albumList = albumList;
        this.userId = userIdIncrement;
        userIdIncrement++;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public List<Album> getAlbumList() {
        return albumList;
    }

    public void setAlbumList(List<Album> albumList) {
        this.albumList = albumList;
    }

    @Override
    public String toString() {
        return "User: " +
                " User Id: " + userId +
                ", Name: " + name + '\'' +
                ", Album List=" + albumList;
    }
}
