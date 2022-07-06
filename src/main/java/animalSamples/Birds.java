package animalSamples;

public class Birds extends Animal{
    public String wild;
    public String domestic;
    public String colour;
    public String age;

    public Birds(String name, String type, boolean canFly,String wild, String domestic, String colour,String age){
        super(name, type, canFly);
        this.wild = wild;
        this.domestic = domestic;
        this.colour = colour;
        this.age= age;

    }

}
