package item2;

public class Driver {
    //
    public static void main(String[] args) {
        Specifications specifications = new Specifications.Builder(2022, 1500, "TESLA")
                .height("100")
                .width("200")
                .age(1)
                .build();

        System.out.println(specifications.toString());
    }
}
