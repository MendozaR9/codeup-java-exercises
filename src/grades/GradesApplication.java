package grades;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("MendozaR", new Student("Ryan"));
        Student student1 = students.get("MendozaR");

//        student1.addGrade(100);
//        student1.addGrade(100);
//        student1.addGrade(90);

        giveGrades(student1, 100, 100, 90);
        System.out.println(student1.getGradeAverage());

        students.put("Tasty-RiceCake",new Student("Joe"));
        Student student2 = students.get("Tasty-RiceCake");
        giveGrades(student2, 80, 75, 95);
        System.out.println(student2.getGradeAverage());

        students.put("bobbyBoi", new Student("Bob"));
        Student student3 = students.get("bobbyBoi");
        giveGrades(student3, 70, 80,85);

        students.put("kyle", new Student("Kyle"));
        Student student4 = students.get("kyle");
        giveGrades(student4, 50, 60, 70);
        System.out.println(students.keySet());
        System.out.println(getKey(students, student4));
    }
    public static <K, V> K getKey(Map<K, V> map, V value)
    {
        for (Map.Entry<K, V> entry: map.entrySet())
        {
            if (value.equals(entry.getValue())) {
                return entry.getKey();
            }
        }
        return null;
    }
    public static void giveGrades(Student student, int grade1,int grade2 , int grade3){
        student.addGrade(grade1);
        student.addGrade(grade2);
        student.addGrade(grade3);
    }

}
