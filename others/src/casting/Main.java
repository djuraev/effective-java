package casting;

public class Main {

    public static void main(String[] args) {
        //
        Parent pr = new Child();
        pr.age = 25;
        pr.name = "Max";
        System.out.println(pr.printNameAge());

        Child ch = (Child) pr;
        ch.height = 100;
        System.out.println(ch.printNameAge());
    }
}
