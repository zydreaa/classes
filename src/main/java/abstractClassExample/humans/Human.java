package abstractClassExample.humans;

public abstract class Human {
    private final String name;
    protected int age;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void grow(int food, int water) throws Exception{
        //do stuff
        age++;
    }

    public abstract String move(); // you don't have ability to do stuff
    //in this case for each class (adult, baby, teen) you will need to describe it

    public abstract String goTo(String location);

}
