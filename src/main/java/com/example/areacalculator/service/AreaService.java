package com.example.areacalculator.service;

import org.springframework.stereotype.Service;

@Service
public class AreaService {

    public double calculateRectangleArea(double length, double width) {
        return length * width;
    }

    public double calculateSquareArea(double side) {
        return side * side;
    }

    public double calculateCircleArea(double radius) {
        return Math.PI * radius * radius;
    }
}
