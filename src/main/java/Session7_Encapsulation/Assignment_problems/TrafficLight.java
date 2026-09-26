package main.java.Session7_Encapsulation.Assignment_problems;

class Light {
    private String color = "RED";
    private final String id;

    Light(String id) {
        this.id = id;
    }

    void next() {
        if (color.equals("RED")) color = "GREEN";
        else if (color.equals("GREEN")) color = "YELLOW";
        else color = "RED";
    }

    String getColor() {
        return color;
    }

    String getId() {
        return id;
    }
}

public class TrafficLight {
    public static void main(String[] args) {
        Light t = new Light("TL-9");

        System.out.println("ID: " + t.getId());
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
        t.next();
        System.out.println(t.getColor());
    }
}