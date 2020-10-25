package pl.kalinowski.jakub.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Objects;

public class Rent {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "rentseq")
    @GenericGenerator(name = "rentseq", strategy = "increment")
    private int id;

    @Column(name = "date")
    private LocalDate date;

    @ManyToMany(targetEntity = Customer.class)
    @Column(name = "customer")
    private Customer customer;

    @ManyToOne(targetEntity = Car.class)
    @Column(name = "car")
    private Car car;

    public Rent() {
    }

    public Rent(LocalDate date, Customer customer, Car car) {
        this.date = date;
        this.customer = customer;
        this.car = car;
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", car=" + car +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rent rent = (Rent) o;
        return id == rent.id &&
                Objects.equals(date, rent.date) &&
                Objects.equals(customer, rent.customer) &&
                Objects.equals(car, rent.car);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, date, customer, car);
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

}
