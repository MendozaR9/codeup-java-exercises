package warmUps.animals;

public class Fish extends Animal{
    private boolean needsAttention = true;
    private boolean canBreathUnderWater =true;

    public Fish(int numberOfLegs, String preferredClimate) {
        super(numberOfLegs, preferredClimate);

    }

    public boolean isNeedsAttention() {
        return needsAttention;
    }

    public void setNeedsAttention(boolean needsAttention) {
        this.needsAttention = needsAttention;
    }

    public boolean isCanBreathUnderWater() {
        return canBreathUnderWater;
    }

    public void setCanBreathUnderWater(boolean canBreathUnderWater) {
        this.canBreathUnderWater = canBreathUnderWater;
    }

    @Override
    String getAnimalInfo() {
        return "Fish Details: \n" +
                "Number of legs: "+ numberOfLegs+"\n" +
                "Needs Attention: "+ needsAttention+"\n" +
                "Preferred climate: "+ preferredClimate+"\n" +
                "Can breath UnderWater: "+ canBreathUnderWater +"\n";
    }
}
