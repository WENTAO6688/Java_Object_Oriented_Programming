package Object_Oriented_Programming.Simple_Factory_Method;

public class Available_products {

    public Food getFood(String name) {

        switch (name){
        case "Apple":
            return new Apple();

        case "Tomato":
            return new Tomato();

        case "Lattuce":
            return new Lattuce();

        default:
            System.out.println("We can't produce this food!");
            return null;

        }
    }

}
