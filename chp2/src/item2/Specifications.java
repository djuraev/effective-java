package item2;

public class Specifications {
    //
    private int year;
    private int mass;
    private String model;

    private String massUnit;
    private int age;
    private String height;
    private String width;

    public static class Builder {
        private int year;
        private int mass;
        private String model;

        private String massUnit = "gr";
        private int age = 1;
        private String height = "0";
        private String width = "0";

        public Builder(int year, int mass, String model) {
            this.year = year;
            this.mass = mass;
            this.model = model;
        }

        public Builder massUnit(String val) {
            //
            massUnit = val;
            return this;
        }

        public Builder age(int val) {
            this.age = val;
            return this;
        }

        public Builder height(String val) {
            this.height =  val;
            return this;
        }

        public Builder width(String val) {
            this.width = val;
            return this;
        }

        public Specifications build() {
            return new Specifications(this);
        }
    }
    private Specifications(Builder builder) {
        this.year = builder.year;
        this.mass = builder.mass;
        this.model = builder.model;
        this.massUnit = builder.massUnit;
        this.age = builder.age;
        this.height = builder.height;
        this.width = builder.width;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        String NL = System.getProperty("line.separator");
        sb.append(this.getClass().getName()).append(" Object {" + NL);
        sb.append(" Year: ").append(year).append(NL);
        sb.append("}");
        return sb.toString();
    }
}
