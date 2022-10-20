package grades;

import java.util.ArrayList;

public class Student {
    private String names;
    private ArrayList <Integer> grades = new ArrayList<>();

    public static void main(String[] args) {
        Student student = new Student("joe");
        student.addGrade(5);
        student.addGrade(5);
        student.addGrade(5);
        student.addGrade(10);
        System.out.println(student.grades);
        System.out.println(student.getGradeAverage());
    }

    public Student(String names) {
        this.names = names;
//        this.grades = new ArrayList<>();
    }

    public String getNames() {
        return names;
    }

    public void addGrade(int grade){
        this.grades.add(grade);
    }

    public double getGradeAverage() {
        //add all then divide by amount
        double average = 0;
        for (Integer grade : this.grades) {
            average += grade;
        }
        return (average/ (double) this.grades.size());
    }

}
