package casting;

public class Child extends Parent {
    int height;

    @Override
    public String printNameAge() {
        return super.printNameAge() + ", " + height;
    }
}
