package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.Car;
import web.service.CarService;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public static String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        Car car = new Car();
        List<Car> list = car.getList();
        list = CarService.getCarsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";
    }
}
