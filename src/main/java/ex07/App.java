/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex07;

import java.util.Scanner;

public class App {
    static Scanner in = new Scanner(System.in);

    public static double CONVERSION = 0.09290304;

    public static void main(String[] args) {
        App myApp = new App();

        double length = myApp.readLength();
        double width = myApp.readWidth();

        double area = myApp.areaFeet(length, width);
        double areaMeters = myApp.areaMeters(area);

        String generateOutput = myApp.concatStrings(length, width, area, areaMeters);
        myApp.output(generateOutput);
    }

    public int readLength() {
        System.out.print("What is the length of the room in feet? ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid length. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public int readWidth() {
        System.out.print("What is the width of the room in feet? ");

        // User can only enter number
        while (!in.hasNextDouble()) {
            System.out.print("Invalid width. Enter again: ");
            in.next();
        }

        return in.nextInt();
    }

    public double areaFeet(double length, double width) {

        return length * width;
    }

    public double areaMeters(double area) {

        return area * CONVERSION;
    }

    public String concatStrings(double length, double width, double area, double areaMeters){

        int l, w, a;

        String lengthString = Double.toString(length);
        String widthString = Double.toString(width);
        String areaString = Double.toString(area);

        if (length % 1 == 0) {
            l = (int) length;
            lengthString = String.format("%d", l);
        }

        if (width % 1 == 0) {
            w = (int) width;
            widthString = String.format("%d", w);
        }

        if (area % 1 == 0) {
            a = (int) area;
            areaString = String.format("%d", a);
        }

        return String.format("You entered dimensions of %s feet by %s feet.\nThe area is %s square feet\n%.3f square meters", lengthString, widthString, areaString, areaMeters);
    }

    public void output(String printThis) {
        System.out.println(printThis);
    }
}
