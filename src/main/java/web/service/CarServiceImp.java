package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImp implements CarService {
    private List<Car> list;

    public CarServiceImp() {
        list = new ArrayList<>();

        list.add(new Car("model1", "brand1", 11));
        list.add(new Car("model2", "brand2", 22));
        list.add(new Car("model3", "brand3", 33));
        list.add(new Car("model4", "brand4", 44));
        list.add(new Car("model5", "brand5", 55));
    }

    public List<Car> getCars(Integer number) {
        return list.stream().limit(number).toList();
    }
}
