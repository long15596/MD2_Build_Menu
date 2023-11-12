package models;

public class Document {
    private int dCore;
    private String manufacturerName;
    private int releaseNum;
    private static int coreIncrement = 1;
    public Document(){}
    public Document(String manufacturerName, int releaseNum) {
        this.dCore = coreIncrement;
        this.manufacturerName = manufacturerName;
        this.releaseNum = releaseNum;
        coreIncrement++;
    }

    public int getDCore() {
        return dCore;
    }

    public void setDCore(int dCore) {
        this.dCore = dCore;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public int getReleaseNum() {
        return releaseNum;
    }

    public void setReleaseNum(int releaseNum) {
        this.releaseNum = releaseNum;
    }
}
