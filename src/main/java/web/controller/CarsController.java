package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import web.Service.CarService;
import web.Service.CarServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarsController {

    public CarService carService;

    @Autowired
    public CarsController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping("/cars")
    public String getCars(@RequestParam(value = "count", required = false) Integer count, ModelMap model){

        model.addAttribute("cars", carService.getCars(count));

        return "cars";
    }

}
