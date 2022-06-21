package abstractClassExample.humans;

public class Baby extends Human { //when you extend abstract class you need to implement all metrics and constructor


    public Baby(String name, int age){
        super(name, age);
    }

    @Override
    public String move(){
        return  "Crawling away!!!";
}

    @Override
    public String goTo(String location) {
        if (!location.equals("sleep")) return "Baby doesn't go to " + location;

            return  "Baby going to " + location;
    }


}
