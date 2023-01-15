package item1;

public class Product {
    //
    private String name;
    private String category;
    private String origin;

    private Product(String name, String category, String origin) {
        this.name = name;
        this.category = category;
        this.origin = origin;
    }

    public static Product of(String name, String category, String origin) {
        return new Product(name, category, origin);
    }

    public static Product sample() {
        return new Product (
                "Chocolate",
                "Sweet",
                "Swiss");
    }
}
