/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Rectangle {

    private double length;
    private double width;

    public void setLength(double len) {
        // todo: validation
        if (len < 0) {
            len = 0;
        }
        length = len;
    }

    public void setWidth(double wid) {
        // todo: validation
        width = wid;
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }
    
    public double getArea() {
        return length * width;
    }

}
