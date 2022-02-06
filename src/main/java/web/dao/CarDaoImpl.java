package web.dao;


import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarDaoImpl implements CarDao {

    List<Car> carList;

    {
        carList = new ArrayList<>();
        carList.add(new Car(1, "Red", "BMW"));
        carList.add(new Car(2, "Black", "Toyota"));
        carList.add(new Car(3, "Green", "Nissan"));
        carList.add(new Car(4, "Metallic", "Ferrari" ));
        carList.add(new Car(5, "Yellow", "Suzuki"));
    }

    @Override
    public List<Car> getAllCars() {
        return carList;
    }

    @Override
    public List<Car> getCarByCount(Integer count) {
        return carList.subList(0,count);
    }
}
