package chp11;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        //
        Insurance insurance = new Insurance("Metlife", 100000, "KRW");
        Car kia = new Car("KIA");

        Person man = new Person("Wick");
        man.setCar(Optional.of(kia));
        kia.setInsurance(Optional.of(insurance));
        Optional<Person> opm = Optional.of(man);
        Optional<String> model = opm.flatMap(Person::getCar).flatMap(Car::getInsurance).map(Insurance::getName);
        System.out.println(model);
    }
}
