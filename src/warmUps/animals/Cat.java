package warmUps.animals;

public class Cat extends Animal{

    private boolean needsAttention = false;
    private boolean isMoody=true;

    public Cat(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);

    }

    public boolean isNeedsAttention() {
        return needsAttention;
    }

    public void setNeedsAttention(boolean needsAttention) {
        this.needsAttention = needsAttention;
    }

    public boolean isMoody() {
        return isMoody;
    }

    public void setMoody(boolean moody) {
        isMoody = moody;
    }

    @Override
    String getAnimalInfo() {
        return "Cat Details: \n" +
                "Number of legs: "+ numberOfLegs+"\n" +
                "Needs Attention: "+ needsAttention+"\n" +
                "Preferred climate: "+ preferredClimate+"\n" +
                "Is Moody: "+isMoody+"\n";
    }
}
