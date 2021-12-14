package web.dao;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import web.model.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {
    static List<Car> cars = new ArrayList<>(Arrays.asList(new Car(2, "model1", 1),
            new Car(22, "model2", 2),
            new Car(33, "model3", 3),
            new Car(43, "model4", 4),
            new Car(43, "model5", 5)));

    public static final Integer Y = cars.size();
//        cars.add(new Car(2, "model1", 1));
//        cars.add(new Car(22, "model2", 2));
//        cars.add(new Car(33, "model3", 3));
//        cars.add(new Car(43, "model4", 4));
//        cars.add(new Car(43, "model5", 5));


    @Override
    public List<Car> getCars(Integer count) {
        return cars.stream().limit(count).collect(Collectors.toList());
    }

    @Override
    public List<Car> getAllCars() {
        return cars;
    }
}
