package item4;

public class UtilityClass {
    //
    private UtilityClass() {
        //
        throw new AssertionError();
    }

    public static void utilMethod1() {
        //
        System.out.println("THIS IS UTIL METHOD 1.");
    }

    public static void utilMethod2() {
        System.out.println("THIS IS UTIL METHOD 2.");
    }
}
