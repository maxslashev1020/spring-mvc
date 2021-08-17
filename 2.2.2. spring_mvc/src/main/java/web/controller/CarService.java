package web.controller;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    public static List<Car> getCarsCount(List<Car> list, int number) {
        if (number == 0 || number > 5) return list;
        return list.stream().limit(number).collect(Collectors.toList());
    }
}
