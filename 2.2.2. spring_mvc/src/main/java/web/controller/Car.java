package web.controller;

public class Car {
    private String model;
    private String color;
    private Integer price;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Car(String model, String color, Integer price) {
        this.color = color;
        this.model = model;
        this.price = price;


    }
}
