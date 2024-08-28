package com.example.areacalculator.controller;

import com.example.areacalculator.service.AreaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AreaController {

    @Autowired
    private AreaService areaService;

    @GetMapping("/area/rectangle")
    public double getRectangleArea(@RequestParam double length, @RequestParam double width) {
        return areaService.calculateRectangleArea(length, width);
    }

    @GetMapping("/area/square")
    public double getSquareArea(@RequestParam double side) {
        return areaService.calculateSquareArea(side);
    }

    @GetMapping("/area/circle")
    public double getCircleArea(@RequestParam double radius) {
        return areaService.calculateCircleArea(radius);
    }
}
