import java.util.ArrayList;

public class Student {

    public String name;
    public ArrayList<Integer> grades;
    public Long id;

    public Student(String name, ArrayList<Integer> grades, Long id) {
        this.name = name;
        this.grades = grades;
        this.id = id;
    }

    public Student() {

    }

    // returns the student's id
    public long getId(){

        return id;

    }

    // returns the student's name
    public String getName(){
        return name;

    }

    // adds the given grade to the grades list
    public void addGrade(int grade){

    }

    // returns the list of grades
    public ArrayList<Integer> getGrades(){
        return grades;

    }

    // returns the average of the students grades
    public double getGradeAverage(){

        return 0;
    }



    public void setName(String name) {
        this.name = name;
    }



    public void setGrades(ArrayList<Integer> grades) {
        this.grades = grades;
    }



    public void setId(Long id) {
        this.id = id;
    }
}
