
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

        Rectangle myRectangle2 = new Rectangle();
        myRectangle2.setLength(1);
        myRectangle2.setWidth(2);
        System.out.println(myRectangle2.getArea());
    }
}
