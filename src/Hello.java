public class Hello {
    public static void main(String[] args){
        System.out.println("Hello, Sam");

        boolean isAlien = false;
        if (isAlien == false) {
            System.out.println("It is not an alien");
            System.out.println("And I am scared of aliens");
        }

        int topScore = 100;
        if (topScore >= 100)
            System.out.println("You for the high score!");

        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");

        if ((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of the conditions are true.");
        }

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is true");
        }

        boolean isCar = true;
        if (isCar) {
            System.out.println("isCar is true.");
        }
        if (!isCar) {
            System.out.println("isCar is false.");
        }

        String makeOfCar = "Volkswagen";
        boolean isDomestic = makeOfCar == "Volkswagen" ? true : false;

        if (isDomestic) {
            System.out.println("Domestic is true.");
        }
        if (!isDomestic) {
            System.out.println("Domestic is false.");
        }

        String s = (isDomestic) ? "This car is domestic" : "This car is no domestic";
        System.out.println(s);

        double d20 = 20.00;

        double d80 = 80.00;

        double step3 = (d20 + d80) * 100.00;

        double remainder1 = step3 % 40.00;

        boolean bool1 = (remainder1 != 0.00) ? false : true;
        // The instructions was worded in a clumsy way, otherwise this would've been more straightforward..

        if (bool1) {
            System.out.println("There is no remainder");
            System.out.println(remainder1);
        }
        if (!bool1) {
            System.out.println("There is remainder");
            System.out.println(remainder1);
        }
    }
}

// println gives a new next line