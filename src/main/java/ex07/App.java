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

        int length = myApp.readLength();
        int width = myApp.readWidth();

        int area = myApp.areaFeet(length, width);
        double areaMeters = myApp.areaMeters(area);

        String generateOutput = myApp.concatStrings(length, width, area, areaMeters);
        myApp.output(generateOutput);
    }

    public int readLength() {
        System.out.print("What is the length of the room in feet? ");
        return in.nextInt();
    }

    public int readWidth() {
        System.out.print("What is the width of the room in feet? ");
        return in.nextInt();
    }

    public int areaFeet(int length, int width) {
        return length * width;
    }

    public double areaMeters(int area) {
        return area * CONVERSION;
    }

    public String concatStrings(int length, int width, int area, double areaMeters){
        return String.format("You entered dimensions of %d feet by %d feet.\nThe area is\n%d square feet\n%.3f square meters", length, width, area, areaMeters);
    }

    public void output(String printThis) {
        System.out.println(printThis);
    }
}
