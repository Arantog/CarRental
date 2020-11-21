package pl.sda.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
@Entity
@Table(name = "Rental")
public class Rental {
    @Id
    @Column(name = "id")
    @GeneratedValue(generator = "rentseq")
    @GenericGenerator(name = "rentseq", strategy = "increment")
    private int id;

    @Column(name = "date")
    private LocalDate date;

    @OneToMany(targetEntity = Customer.class)
    private List<Customer> customer;

    @OneToMany(targetEntity =  Car.class)
    private List<Car> car;

    public Rental() {
    }

    public Rental(LocalDate date, ArrayList<Customer> customer, ArrayList<Car> car) {
        this.date = date;
        this.customer = customer;
        this.car = car;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Rental rental = (Rental) o;
        return id == rental.id &&
                Objects.equals(date, rental.date) &&
                Objects.equals(customer, rental.customer) &&
                Objects.equals(car, rental.car);
    }

    @Override
    public String toString() {
        return "Rental{" +
                "id=" + id +
                ", date=" + date +
                ", customer=" + customer +
                ", car=" + car +
                '}';
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

    public List<Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<Customer> customer) {
        this.customer = customer;
    }

    public List<Car> getCar() {
        return car;
    }

    public void setCar(List<Car> car) {
        this.car = car;
    }
}
