import java.lang.reflect.Array;
import java.util.Arrays;

public class ArraysExercises {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(numbers));
    String [] person = new String[3];
    person[0] = "Bobby";
    person[1]= "Joe";
    person[2]= "Jeff";
        for (int i = 0; i < person.length ; i++) {
            System.out.println(person[i]);
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
