package warmUps;

public class RubberDuck {
    RubberDuck duck = new RubberDuck();
    private String color;
    private boolean canMakeNoise;
    private int numOfEyes;

    public static void main(String[] args) {

    }
    public RubberDuck(){

    }
    public RubberDuck(String color, boolean noise, int eyes){
        System.out.println("duck Created");
        this.color = color;
        this.canMakeNoise = noise;
        this.numOfEyes = eyes;
    }
    public String getColor(){
        return this.color;
    }
    public void setColor( String color){
        this.color = color;
    }

    public boolean getNoise(){
        return this.canMakeNoise;
    }
    public void setNoise(boolean noise){
        this.canMakeNoise = noise;
    }

    public int getNumOfEyes(){
        return this.getNumOfEyes();
    }
    public void setNumOfEyes(int eyes){
        this.numOfEyes= eyes;
    }

}
