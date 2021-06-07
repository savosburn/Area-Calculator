/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Savannah Osburn
 */

package ex07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    public void output_string_includes_area_and_converted_area() {
        App myApp = new App();

        int length = 15;
        int width = 20;
        int area = 15 * 20;
        double areaConverted = area * 0.09290304;

        String expectedOutput = """
                You entered dimensions of 15 feet by 20 feet.
                The area is 300 square feet
                27.871 square meters""";

        String actualOutput = myApp.concatStrings(length, width, area, areaConverted);

        assertEquals(expectedOutput, actualOutput);
    }
}