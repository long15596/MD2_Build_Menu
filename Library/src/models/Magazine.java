package models;

public class Magazine extends Document{
    private int issueNum;
    private String date;

    public Magazine(String manufacturerName, int releaseNum, int issueNum, String date) {
        super(manufacturerName, releaseNum);
        this.issueNum = issueNum;
        this.date = date;
    }

    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Magazine: " + "\n"
                + " Core: " + Magazine.this.getDCore() + "\n"
                + " Manufacture Name: " + Magazine.this.getManufacturerName() + "\n"
                + " Release Numbers: " + Magazine.this.getReleaseNum() + "\n"
                + " Issue Numbers: " + issueNum + '\n'
                + " Date: " + date;
    }
}
