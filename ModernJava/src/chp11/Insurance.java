package chp11;

public class Insurance {
    private String name;
    private int cost;
    private String currency;

    public Insurance(String name, int cost, String currency) {
        this.name = name;
        this.cost = cost;
        this.currency = currency;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        return "Insurance{" +
                "name='" + name + '\'' +
                ", cost=" + cost +
                ", currency='" + currency + '\'' +
                '}';
    }
}
