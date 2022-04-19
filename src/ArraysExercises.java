import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        Person person1 = new Person("Bobby");
        Person person2 = new Person("Joe");
        Person person3 = new Person("Jeff");
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    String [] person = new String[3];
    person[0] = person1.getName();
    person[1]= person2.getName();
    person[2]= person3.getName();
        for (String s : person) {
            System.out.println(s);
        }
        System.out.println(Arrays.toString(addPerson(person, "Bob")));
    }

    public static String[] addPerson(String[] person, String addedPerson){
        String [] newPersons = new String[person.length+1];
        for (int i = 0; i < person.length; i++) {
            newPersons[i] = person[i];
        }
        newPersons[person.length] = addedPerson;
        return newPersons;
    }
}
