package web.model;

import java.util.Objects;

public class Car {
    private int series;
    private String model;
    private int id;

    public int getSeries() {
        return series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "series=" + series +
                ", web.model='" + model + '\'' +
                ", id=" + id +
                '}';
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Car(int series, String model, int id) {
        this.series = series;
        this.model = model;
        this.id = id;
    }

    public Car() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return series == car.series && Objects.equals(model, car.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(series, model);
    }
}
