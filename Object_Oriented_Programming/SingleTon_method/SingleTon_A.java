package Object_Oriented_Programming.SingleTon_method;

public class SingleTon_A {

    public static SingleTon_A singleTonA;

    private SingleTon_A(){

    }

    public static SingleTon_A getInstance(){

        return singleTonA;
    }
}
