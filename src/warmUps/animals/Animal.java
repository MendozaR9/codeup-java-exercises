package warmUps.animals;

public abstract class Animal {

    //typically, we do NOT add main methods (or any static methods) to a POJO

    //fields
    protected int numberOfLegs;
    protected String preferredClimate;

    //constructor(s)
    public Animal(int numberOfLegs, String preferredClimate){
        this.numberOfLegs = numberOfLegs;
        this.preferredClimate = preferredClimate;
    }

    public Animal(int numberOfLegs){
        // what if we don't know the preferredClimate yet?
        // Then don't add a parameter for it.
        // Make the app use the setter method later on
        this.numberOfLegs = numberOfLegs;
    }

    public Animal(){
        // and if we don't know ANY values for fields yet?
        // good sign we may need an empty constructor
        // the app will have to use the setter methods later on
    }

    //properties
    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public String getPreferredClimate() {
        return preferredClimate;
    }

    public void setPreferredClimate(String preferredClimate) {
        this.preferredClimate = preferredClimate;
    }

    abstract String getAnimalInfo();
}
