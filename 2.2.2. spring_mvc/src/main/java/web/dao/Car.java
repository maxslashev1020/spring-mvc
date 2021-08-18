package web.dao;

import java.util.ArrayList;
import java.util.List;

public class Car {
    private String model;
    private String color;
    private Integer price;

    public List<Car> getList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", "RED", 10000));
        list.add(new Car("BMW", "YELLOW", 12000));
        list.add(new Car("Mersedes", "BLACK", 15000));
        list.add(new Car("Opel", "GREEN", 8000));
        list.add(new Car("Volkswagen", "BLUE", 5000));
        return list;
    }
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

    public Car() {
    }

    public Car(String model, String color, Integer price) {
        this.color = color;
        this.model = model;
        this.price = price;


    }
}
