package models;

import java.util.Date;

public class Newspaper extends Document {
    private String date;

    public Newspaper(String manufacturerName, int releaseNum, String date) {
        super(manufacturerName, releaseNum);
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Newspaper: " + "\n"
                + " Core: " + Newspaper.this.getDCore() + "\n"
                + " Manufacture Name: " + Newspaper.this.getManufacturerName() + "\n"
                + " Release Numbers: " + Newspaper.this.getReleaseNum() + "\n"
                + " Date: " + date;
    }

    public static void main(String[] args) {
        Document document = new Newspaper("abc", 20, "10/10/2010");
        System.out.println(document);
    }
}
