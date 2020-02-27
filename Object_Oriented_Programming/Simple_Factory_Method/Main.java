package Object_Oriented_Programming.Simple_Factory_Method;

public class Main {

    public static void main (String[] args){

        System.out.println("This is Simple Factory Main Method");

        Available_products myFood = new Available_products();

        Food food = myFood.getFood("Tomato");

            if (food != null) {

                food.eat();
            }

        food = myFood.getFood("Apple");

            if (food != null) {

                food.eat();
            }

        food = myFood.getFood("Lattuce");

            if (food != null) {

                food.eat();

        food = myFood.getFood("Orange");

            if (food != null){

                food.eat();
            }

            }

        }

    }


