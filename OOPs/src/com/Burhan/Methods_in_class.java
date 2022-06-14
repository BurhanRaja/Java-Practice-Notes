package com.Burhan;

public class Methods_in_class {
    public static void main(String[] args) {
        Pen pen1 = new Pen("black", "ballpoint", 100);
        pen1.printColor();
        pen1.printType();
        pen1.printNoOfPen();
        pen1.write();
    }
}

class Pen {
    String color;
    String type;
    int numberOfPen;

    Pen(String col, String ty, int numberOfPen) {
        this.color = col;
        this.type = ty;
        this.numberOfPen = numberOfPen;
    }

    public void write() {
        System.out.println("Something is written");
    }
    public void printColor() {
        System.out.println(this.color);
    }
    public void printType() {
        System.out.println(this.type);
    }
    public void printNoOfPen() {
        System.out.println(this.numberOfPen);
    }
}
