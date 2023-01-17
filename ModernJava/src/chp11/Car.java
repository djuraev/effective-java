package chp11;

import java.util.Optional;

public class Car {
    private String model;
    public Optional<Insurance> insurance;

    public Car(String model) {
        this.model = model;
    }

    public Car() {
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Optional<Insurance> getInsurance() {
        return insurance;
    }

    public void setInsurance(Optional<Insurance> insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", insurance=" + insurance +
                '}';
    }
}
