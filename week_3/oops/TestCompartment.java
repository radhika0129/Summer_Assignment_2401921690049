package week_3.oops;

import java.util.Random;

abstract class Compartment {

    public abstract String notice();
}


// First Class Compartment
class FirstClass extends Compartment {

    public String notice() {
        return "First Class Compartment: Comfortable seats and AC facility available.";
    }
}


// Ladies Compartment
class Ladies extends Compartment {

    public String notice() {
        return "Ladies Compartment: This compartment is reserved for ladies.";
    }
}


// General Compartment
class General extends Compartment {

    public String notice() {
        return "General Compartment: Normal seating facility available.";
    }
}


// Luggage Compartment
class Luggage extends Compartment {

    public String notice() {
        return "Luggage Compartment: Only luggage is allowed in this compartment.";
    }
}


// Main Class
public class TestCompartment {

    public static void main(String[] args) {

        Compartment[] compartments = new Compartment[10];

        Random random = new Random();

        for (int i = 0; i < compartments.length; i++) {

            int choice = random.nextInt(4) + 1;

            switch (choice) {

                case 1:
                    compartments[i] = new FirstClass();
                    break;

                case 2:
                    compartments[i] = new Ladies();
                    break;

                case 3:
                    compartments[i] = new General();
                    break;

                case 4:
                    compartments[i] = new Luggage();
                    break;
            }
        }


        // Polymorphic behavior
        for (int i = 0; i < compartments.length; i++) {

            System.out.println("Compartment " + (i + 1) + ": ");
            System.out.println(compartments[i].notice());
            System.out.println();
        }
    }
}