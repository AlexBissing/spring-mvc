package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.CarDao;
import web.model.Car;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {

    @Autowired
    private CarDao carDao;

    @Override
    public List<Car> getAllCars(int count) {
        return carDao.getAllCars();
    }

    @Override
    public List<Car> getCarByCount(Integer count) {
        return carDao.getCarByCount(count);
    }
}
