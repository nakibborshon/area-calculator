package com.example.areacalculator.service;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AreaServiceTest {

    private final AreaService areaService = new AreaService();

    private static final Logger logger = LoggerFactory.getLogger(AreaService.class);

    @Test
    void testCalculateRectangleArea() {
        double length = 5.0;
        double width = 10.0;
        double expectedArea = 50.0;

        double actualArea = areaService.calculateRectangleArea(length, width);

        assertEquals(expectedArea, actualArea, "Rectangle area should be 50.0");
        logger.info("Test 1 pass");
    }

    @Test
    void testCalculateSquareArea() {
        double side = 4.0;
        double expectedArea = 16.0;

        double actualArea = areaService.calculateSquareArea(side);

        assertEquals(expectedArea, actualArea, "Square area should be 16.0");
        logger.info("Test 2 pass");
    }

    @Test
    void testCalculateCircleArea() {
        double radius = 7.0;
        double expectedArea = Math.PI * radius * radius;

        double actualArea = areaService.calculateCircleArea(radius);

        assertEquals(expectedArea, actualArea, "Circle area should be approximately 153.94");
        logger.info("Test 3 pass");
    }
}
