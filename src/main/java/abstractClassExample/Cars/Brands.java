package abstractClassExample.Cars;

public class Brands extends Cars{

    public Brands(String name, int tankCapacity, int maxSpeed){
    super(name, tankCapacity, maxSpeed);}



    @Override
    public String distance() {
        if (tankCapacity >= 50) return "car will cover more than 200km";
        return "car will cover only 150km";
    }

    @Override
    public String luxuryCar(String name) {
        if(name.equals("ferrari")) return name + " car can reach more than 230km/h speed";
        if (name.equals("audi"))    return name + " car can reach more than 230km/h speed";

        return name + " car max speed is no more than 200km/h";
    }
}
