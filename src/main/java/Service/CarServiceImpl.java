package Service;

import model.Car;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CarServiceImpl implements CarService {
    public static List<Car> getCars(Integer count) {

        List<Car> cars = new ArrayList<>();

        cars.add(new Car(2, "model1", 1));
        cars.add(new Car(22, "model2", 2));
        cars.add(new Car(33, "model3", 3));
        cars.add(new Car(43, "model4", 4));
        cars.add(new Car(43, "model5", 5));

        if (count != null) {
            if (count > 0 && count < 5) {
                return cars.stream().limit(count).collect(Collectors.toList());
            } else {
                return cars;
            }
        } else {
            return cars;
        }
    }
}
