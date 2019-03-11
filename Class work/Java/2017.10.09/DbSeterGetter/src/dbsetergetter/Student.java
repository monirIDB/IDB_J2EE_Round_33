
package dbsetergetter;

import java.util.Date;


public class Student {
    private int sid;
    private String name;
    private String email;
    private float height;
    private Date admitDate;

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Date getAdmitDate() {
        return admitDate;
    }

    public void setAdmitDate(Date admitDate) {
        this.admitDate = admitDate;
    }

    public Student(int sid, String name, String email, float height, Date admitDate) {
        this.sid = sid;
        this.name = name;
        this.email = email;
        this.height = height;
        this.admitDate = admitDate;
    }

    public Student() {
    }
}
