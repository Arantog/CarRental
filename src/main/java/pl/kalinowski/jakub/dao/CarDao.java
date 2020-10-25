package pl.kalinowski.jakub.dao;

import pl.kalinowski.jakub.model.Car;

public class CarDao extends AbstractDao<Car> {
    public CarDao() {
        super(Car.class);
    }
}
