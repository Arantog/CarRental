package pl.kalinowski.jakub.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Objects;

public class Car {
    @Id
    @GeneratedValue(generator = "carseq")
    @GenericGenerator(name ="carseq", strategy = "increment")
    private int id;

    @Column(name = "mark")
    private String mark;

    @Column(name = "model")
    private String model;

    @Column(name = "colour")
    private String colour;

    @Column(name = "regNumber")
    private String regNumber;

    @Column(name = "isCarWorking")
    private boolean isCarWorking;

    public Car() {
    }

    public Car(String mark, String model, String colour, String regNumber, boolean isCarWorking) {
        this.mark = mark;
        this.model = model;
        this.colour = colour;
        this.regNumber = regNumber;
        this.isCarWorking = isCarWorking;
    }

    @Override
    public String toString() {
        return "Car{" +
                "id=" + id +
                ", mark='" + mark + '\'' +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", regNumber='" + regNumber + '\'' +
                ", isCarWorking=" + isCarWorking +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return id == car.id &&
                isCarWorking == car.isCarWorking &&
                Objects.equals(mark, car.mark) &&
                Objects.equals(model, car.model) &&
                Objects.equals(colour, car.colour) &&
                Objects.equals(regNumber, car.regNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, mark, model, colour, regNumber, isCarWorking);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getRegNumber() {
        return regNumber;
    }

    public void setRegNumber(String regNumber) {
        this.regNumber = regNumber;
    }

    public boolean isCarWorking() {
        return isCarWorking;
    }

    public void setCarWorking(boolean carWorking) {
        isCarWorking = carWorking;
    }
}
