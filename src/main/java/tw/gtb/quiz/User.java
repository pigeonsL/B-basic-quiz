package tw.gtb.quiz;


public class User {

    private long id;
    private String name;
    private long age;
    private String avatar;
    private String des;

    public User() {
    }

    public User(long id, String name, long age, String avatar, String des) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.avatar = avatar;
        this.des = des;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }
}
