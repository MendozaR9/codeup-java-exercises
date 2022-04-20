package grades;

import util.Input;

import java.util.HashMap;
import java.util.Map;

public class GradesApplication {



    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();
        students.put("MendozaR", new Student("Ryan"));
        Student student1 = students.get("MendozaR");
        giveGrades(student1, 100, 100, 90);
//        System.out.println(student1.getGradeAverage());

        students.put("Tasty-RiceCake",new Student("Joe"));
        Student student2 = students.get("Tasty-RiceCake");
        giveGrades(student2, 80, 75, 95);
//        System.out.println(student2.getGradeAverage());

        students.put("bobbyBoi", new Student("Bob"));
        Student student3 = students.get("bobbyBoi");
        giveGrades(student3, 70, 80,85);

        students.put("kyle", new Student("Kyle"));
        Student student4 = students.get("kyle");
        giveGrades(student4, 50, 60, 70);
//        System.out.println(students.keySet());
//        System.out.println(getKey(students, student4));

        Input input = new Input();
        boolean seeAnotherStudent = true;
        while (seeAnotherStudent) {
            System.out.println("\nWellcome!\n" +
                    "Here are the Github usernames of our students");
            System.out.println("|" + getKey(students, student1) + "| " +
                    "|" + getKey(students, student2) + "| " +
                    "|" + getKey(students, student3) + "| " +
                    "|" + getKey(students, student4) + "| \n" +
                    "What Student would you like to see more information on?");
            System.out.print("> ");
            String username = input.getString();
            if (username.equals(getKey(students, student1))) {
                System.out.println(studentInfo(students, student1));
            }
            else if (username.equals(getKey(students, student2))) {
                System.out.println(studentInfo(students, student2));
            }
            else if (username.equals(getKey(students, student3))) {
                System.out.println(studentInfo(students, student3));
            }
            else if (username.equals(getKey(students, student4))) {
                System.out.println(studentInfo(students, student4));
            }else {
                System.out.println("Sorry, no student found with the Github" +
                        " username of "+username);
            }



            System.out.println("\nWould you like to see another student?");
             if (!new Input().yesNo()){
                 seeAnotherStudent = false;
             }
        }
        System.out.println("Goodbye, and have a wonderful day");
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


public static String studentInfo(HashMap student, Student value){

        return "Name: "+value.getNames()+
                " - Github Username: "+ getKey(student,value)+"\n" +
            "Current Average: "+value.getGradeAverage();
}

    public static void giveGrades(Student student, int grade1,int grade2 , int grade3){
        student.addGrade(grade1);
        student.addGrade(grade2);
        student.addGrade(grade3);
    }

}
