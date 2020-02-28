package Object_Oriented_Programming.SingleTon_method;

public class SingleTon_B {

    public static SingleTon_B singleTonB = null;

    private SingleTon_B() {

    }

    public static SingleTon_B getInstance() {

        if (singleTonB == null) {

            singleTonB = new SingleTon_B();
        }

        return singleTonB;

        }

}
