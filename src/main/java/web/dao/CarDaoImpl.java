package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao{
    @Transactional(readOnly = true)
    @Override
    public List<Car> getCars(Integer count) {

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
