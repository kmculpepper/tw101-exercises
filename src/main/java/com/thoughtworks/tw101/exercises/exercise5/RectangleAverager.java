package com.thoughtworks.tw101.exercises.exercise5;

public class RectangleAverager {

    public float averageArea(Rectangle[] rectangles) {
        float area = 0;

        for(Rectangle rect : rectangles){
            area += rect.area();
        }

        return area / rectangles.length;
    }
}
