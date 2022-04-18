public class ServerNameGenerator {
   static String [] nouns ={"car", "duck", "Titanic", "Texas", "Joe", "Italian", "Coke", "Pepsi", "Lion", "RiceCake"};
   static String [] adjectives = {"Sharp", "Cruel", "Charming", "Huge", "Bitter", "Tasty", "Tired", "Fun", "Small", "Small" };

   public static void main(String[] args) {
       System.out.println("Here is your sever name:");
        System.out.println(randomElement(adjectives)+"-"+randomElement(nouns));
    }

    public static String randomElement (String[] array){
        int random = (int) Math.floor(Math.random()*array.length);
        return array[random];
    }
}
