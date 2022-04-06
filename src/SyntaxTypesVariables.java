import java.net.SocketOption;

public class SyntaxTypesVariables {
    public static void main(String[] args) {

//        JS VARIABLE DECLARATION
//        let something = value

//        JAVA VARIABLE DECLARATION

//        DAT -> NAME = VALUE
//        byte myByte = 127; /*maximum*/
        byte dayofMonth = 31;

        short employees = 32767; /*maximum*/

        int userID = 2147483647; /*maximum*/

        long circMilkyway = 9223372036854775807L; /*maximum, need the Capital L at the end*/

        float roundPI = 3.14f; /*needs the f at the end can go up to 7 digits*/

        double somebigdecimal = 3.14159265359245678; /*takes up to16 digits*/

        char yesNo = 'Y'; /*on takes on character in ''*/

        boolean IlikePizza = true;
        boolean IHatePIzza = false;

        String mystring = "Some String";

        String  someQuote = "\"Some Cliche quote\" - Mark Twain";
        System.out.println(someQuote);

        String backslash = "I can do backslash\\. Double backslash \\\\ and triple backslash\\\\\\";
        System.out.println(backslash);

        System.out.println("\t"+someQuote+"\n"+backslash);



    }
}
