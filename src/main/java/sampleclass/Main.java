package sampleclass;

import sampleclass.productSamples.Electronic;
import sampleclass.productSamples.Food;
import sampleclass.productSamples.Product;

import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Product rice = new Product();
        Product bread = new Product("sweet bread");
        Product phone = new Product("Samsung", 1399, 12,18, 500);

        System.out.println(rice.name);
        System.out.println(bread.name);
        System.out.println(phone);

        Product television = new Electronic("Samsung TV", 3404, 34 ,2.6, "24 inchs");
        Electronic laptop = new Electronic("HP", 3234, 5, 4.5, "12 inches");
//        Electronic sample = (Electronic) new Product("HP", 3234, 5); //cast if you want to use this way

        System.out.println(television);
        System.out.println(laptop);
//        System.out.println(sample);

        Food food = new Food("Chocolate", 23, 45, 10d,2f,new Date());
        System.out.println(food);

        System.out.println(food.getDiscount());
        System.out.println(television.getDiscount());
        System.out.println(laptop.getDiscount());
        System.out.println(rice.getDiscount());
        System.out.println(bread.getDiscount());

        //Some valid ways to write numbers
        Integer value1 =  1293948;
        Integer value2 =  129 + 39 + 48; // just a sum of numbers
        Integer value3 =  129_39_48;// only for visibility you split to the groups, but value is same as value1
        float value4 =  129_39_48f;
        Long value5 =  129L + 39_48L;

//        System.out.println(value1);
//        System.out.println(value2);
//        System.out.println(value3);
//        System.out.println(value4);
//        System.out.println(value5);

        /*
        *Animals
            * Birds
                * Eagle
                * Chicken
                    *  Hen
                    * Chick
                * Reptiles
                    * Snakes
         */

    }
}
