package animalSamples;

public class Reptiles extends Animal {

    public int amountOfLegs;
    public String habitat;
    public boolean poisonNotPoison;

    public Reptiles(String name, String type, boolean canFly, int amountOfLegs, String habitat, boolean poisonNotPoison) {
        super(name, type, canFly);
        this.amountOfLegs = amountOfLegs;
        this.habitat = habitat;
        this.poisonNotPoison = poisonNotPoison;

    }
}