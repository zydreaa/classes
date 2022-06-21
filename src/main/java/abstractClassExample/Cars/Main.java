package abstractClassExample.Cars;

public class Main {
    public static void main(String[] args) {

        Brands audi = new Brands("audi", 50, 250);
        Brands opel = new Brands("opel", 40, 150);
        Brands ferrari = new Brands("ferrari", 60, 270);


        System.out.println(audi.distance());
        System.out.println(audi.luxuryCar("audi"));
        System.out.println(opel.distance());
        System.out.println(opel.luxuryCar("opel"));
        System.out.println(ferrari.distance());
        System.out.println(ferrari.luxuryCar("ferrari"));

        try {
            audi.move(45);
            ferrari.move(250);
        }catch (Exception e){
            System.out.println(e);
        }

        System.out.println(audi.getMaxSpeed());

    }
}
