package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {
    @GetMapping("/cars")
    public static String cars(@RequestParam(value = "count", defaultValue = "5") int allCars, Model model) {
        List<Car> list = new ArrayList<>();
        list.add(new Car("Audi", "RED", 10000));
        list.add(new Car("BMW", "YELLOW", 12000));
        list.add(new Car("Mersedes", "BLACK", 15000));
        list.add(new Car("Opel", "GREEN", 8000));
        list.add(new Car("Volkswagen", "BLUE", 5000));
        list = CarService.getCarsCount(list, allCars);
        model.addAttribute("list", list);
        return "car";
    }
}
