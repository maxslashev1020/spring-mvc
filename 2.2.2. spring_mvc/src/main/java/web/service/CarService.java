package web.service;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

public class CarService {
    private static CarDao carDao;
    public  static List<Car> getCarsCount(List<Car> list, int number) {
        return carDao.getCarsCount(list, number);
    }

    public static List<Car> getList() {
        return carDao.getList();
    }
}
