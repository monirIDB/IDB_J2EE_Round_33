
package pakJFrame;


public class Student {
    int id;
    String name;
    String father;
    String mother;
    Float gpa;

    public Student() {
    }

    public Student(int id, String name, String father, String mother, Float gpa) {
        this.id = id;
        this.name = name;
        this.father = father;
        this.mother = mother;
        this.gpa = gpa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public Float getGpa() {
        return gpa;
    }

    public void setGpa(Float gpa) {
        this.gpa = gpa;
    }
}
