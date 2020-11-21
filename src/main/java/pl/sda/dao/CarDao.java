package pl.sda.dao;

import pl.sda.model.Car;

public class CarDao extends AbstractDao<Car> {
    public CarDao() {
        super(Car.class);
    }
}
