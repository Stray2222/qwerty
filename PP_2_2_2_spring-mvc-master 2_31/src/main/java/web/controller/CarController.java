package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.Model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.toList;


@Controller
public class CarController {
    @GetMapping("/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") int count,
                         Model model) {
        model.addAttribute("something", "this my cars");

        List<Car> carList = new ArrayList<>();
        carList.addAll(Arrays.asList(
                new Car("kia", "red", 2021),
                new Car("deo", "blue", 2022),
                new Car("bmv", "black", 2023),
                new Car("mers", "white", 2024),
                new Car("impala", "yellow", 2025)
        ));

        model.addAttribute("cars", carList.stream()
                .limit(count>5 ? carList.size(): count)
                .collect(toList()));

        return "cars";
    }
}

