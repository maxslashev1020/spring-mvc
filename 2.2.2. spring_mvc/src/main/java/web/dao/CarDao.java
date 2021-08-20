package web.dao;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarDao {
    public  static List<Car> getCarsCount(List<Car> list, int number) {
        if (number <= 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }

    public static List<Car> getList() {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", "RED", 10000));
        list.add(new Car("BMW", "YELLOW", 12000));
        list.add(new Car("Mersedes", "BLACK", 15000));
        list.add(new Car("Opel", "GREEN", 8000));
        list.add(new Car("Volkswagen", "BLUE", 5000));
        return list;
    }
}
