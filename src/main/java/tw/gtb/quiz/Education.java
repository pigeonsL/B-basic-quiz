package tw.gtb.quiz;

public class Education {
    private long userId;
    private long year;
    private String title;
    private String des;

    public Education(long userId, long year, String title, String des) {
        this.userId = userId;
        this.year = year;
        this.title = title;
        this.des = des;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getYear() {
        return year;
    }

    public void setYear(long year) {
        this.year = year;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
