public class Person {

    private String name;

    public static void main(String[] args) {
        Person person = new Person("bob");
        Person person4 = new Person("Steve");

       person.sayHello();
       person4.sayHello();
    }
    //constructor
    public Person(String name){
        System.out.println("person created");
        setName(name);
    }
    //getter and setter
    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello "+ this.getName());
    }


}
