package exam.com.apcl.datasavetofirebase;

public class Student {
    String id;
    String name;
    String round;

    public Student() {
    }

    public Student(String id, String name, String round) {
        this.id = id;
        this.name = name;
        this.round = round;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }
}
