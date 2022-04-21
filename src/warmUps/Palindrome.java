package warmUps;

import util.Input;

public class Palindrome {
    static Input input = new Input();
    static String tester;

    public static void main(String[] args) {
        System.out.println("Enter a Palindrome: ");
        tester = input.getString();
        System.out.println(tester+ " is a Palindrome: "+isPalindrome(tester));

    }
    public static boolean isPalindrome(String testPalindrome) {
        //With StingBuilder
//        String reverseInput = new StringBuilder(testPalindrome).reverse().toString();
//        return testPalindrome.equals(reverseInput);

        //Without StringBuilder
        String rev = "";
        char ch;
        for (int i = 0; i < testPalindrome.length(); i++) {
            ch= testPalindrome.charAt(i);
            rev = ch + rev;
        }
        return testPalindrome.equals(rev);
    }
}
