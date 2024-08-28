package com.example.areacalculator.service;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaServiceTest {

    private final AreaService areaService = new AreaService();

    @Test
    void testCalculateRectangleArea() {
        double length = 5.0;
        double width = 10.0;
        double expectedArea = 50.0;

        double actualArea = areaService.calculateRectangleArea(length, width);

        assertEquals(expectedArea, actualArea, "Rectangle area should be 50.0");
    }

    @Test
    void testCalculateSquareArea() {
        double side = 4.0;
        double expectedArea = 16.0;

        double actualArea = areaService.calculateSquareArea(side);

        assertEquals(expectedArea, actualArea, "Square area should be 16.0");
    }

    @Test
    void testCalculateCircleArea() {
        double radius = 7.0;
        double expectedArea = Math.PI * radius * radius;

        double actualArea = areaService.calculateCircleArea(radius);

        assertEquals(expectedArea, actualArea, "Circle area should be approximately 153.94");
    }
}
