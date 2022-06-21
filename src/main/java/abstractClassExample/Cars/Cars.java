package abstractClassExample.Cars;

import java.util.concurrent.ExecutionException;

public abstract class Cars {

    private String name;
    public int tankCapacity;
    private int maxSpeed;

    public Cars(String name, int tankCapacity, int maxSpeed) {
        this.name = name;
        this.tankCapacity = tankCapacity;
        this.maxSpeed = maxSpeed;
    }

    public String getName() {
        return name;
    }

    public int getTankCapacity() {
        return tankCapacity;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }
    public void move (int speed) throws Exception{
        if (speed < 50) maxSpeed -= 50;

        if (speed > 200) throw new Exception("You are too fast!");
    }

    public abstract String distance();

    public abstract String luxuryCar(String name);
}
