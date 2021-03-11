
import java.util.Random;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {
        // classes/objects that we've used already
        Scanner keyboard = new Scanner(System.in);
        Scanner keyboard2 = new Scanner(System.in);
        Scanner keyboard3 = new Scanner(System.in);
        Scanner keyboard4 = new Scanner(System.in);

        Random rand = new Random();

        Rectangle myRectangle = new Rectangle();
        myRectangle.setLength(10);
        myRectangle.setWidth(20);
        System.out.println(myRectangle.getArea());

        Rectangle myRectangle2 = new Rectangle(1, 2);
        System.out.println(myRectangle2.getArea());

        double combinedAreas = addRectangleAreas(myRectangle, myRectangle2);
        System.out.println(combinedAreas);

        // cars
        Car myTruck = new Car(2005, "Ford", "F150", 0, 10);
        Car mySportsCar = new Car(2021, "Ford", "Mustang", 0, 30);

        myTruck.accelerate();
        myTruck.accelerate();

        mySportsCar.accelerate();

        System.out.println(myTruck.getCurrentSpeed());
        System.out.println(mySportsCar.getCurrentSpeed());

        mySportsCar.brake();
        mySportsCar.brake();

        myTruck.brake();
        myTruck.brake();

        System.out.println(myTruck.getCurrentSpeed());
        System.out.println(mySportsCar.getCurrentSpeed());

    }

    // example of taking objects as inputs to methods
    public static double addRectangleAreas(Rectangle rect1, Rectangle rect2) {
        return rect1.getArea() + rect2.getArea();
    }

}
