
package anisvai;


public class Student implements Comparable {
    String fristName, lastName;
    int studentID=0;
    double GPA=0.0;
    public Student(String fristName, String lastName, int StuentID, double GPA){
        if(fristName==null || lastName==null || StuentID == 0 ||GPA==0.0){
            throw new IllegalArgumentException();
        }
        this.fristName=fristName;
        this.lastName=lastName;
        this.studentID=studentID;
        this.GPA=GPA;
    }
    public String fristName(){
        return fristName;
    }
    public String lastName(){
        return lastName;
    }
    public int studentID(){
        return studentID;
    }
    public double GPA(){
        return GPA;
    }
    //Implement comareTo method.
    public int comareTo(Object o){
        double f=GPA-((Student)o).GPA;
        if(f==0.0)
            return 0;  //0 signifies equals
        else if(f<0.0)
            return -1;  //negative value signifies less than or before
        else
            return 1;  //positive value signifies more than or after
    }

    @Override
    public int compareTo(Object o) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}