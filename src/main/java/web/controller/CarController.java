package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.CarServiceImp;

@Controller
public class CarController {

    @GetMapping(value = "/cars")
    public String getCar(@RequestParam(value = "count", defaultValue = "5") String count, ModelMap model) {
        CarServiceImp carServiceImp = new CarServiceImp();

        model.addAttribute("messages", carServiceImp.getCars(Integer.parseInt(count)));

        return "cars";
    }
}
