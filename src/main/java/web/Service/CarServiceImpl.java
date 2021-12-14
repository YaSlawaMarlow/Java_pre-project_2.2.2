package web.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import web.dao.CarDao;
import web.dao.CarDaoImpl;
import web.model.Car;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    private final CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    @Transactional(readOnly = true)
    public List<Car> getCars(Integer count) {
        if (count > 0 && count < CarDaoImpl.Y) {
            return carDao.getCars(count);
        }else {
            return carDao.getAllCars();
        }
    }
}
