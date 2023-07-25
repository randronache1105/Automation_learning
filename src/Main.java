import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        //Find MIN and MAX for a BYTE

        System.out.printf("byte minimum= %s, maximum= %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short minimum= %s, maximum= %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("INT minimum= %s, maximum= %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long minimum= %s, maximum= %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        //Find MIN and MAX for Float and Double

        System.out.printf("Float minimum= %s, maximum= %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double minimum= %s, maximum= %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float f = 123.456789012345678f;
        double d = 123.456789012345678;
        System.out.printf("f is %.99f %n", f);
        System.out.printf("d is %.99f %n", d);

        //Find MIN and MAX for Byte and Short

        System.out.printf("byte minimum= %s, maximum= %s%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short minimum= %s, maximum= %s%n", Short.MIN_VALUE, Short.MAX_VALUE);

        System.out.printf("INT minimum= %s, maximum= %s%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("Long minimum= %s, maximum= %s%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("Float minimum= %s, maximum= %s%n", Float.MIN_VALUE, Float.MAX_VALUE);
        System.out.printf("Double minimum= %s, maximum= %s%n", Double.MIN_VALUE, Double.MAX_VALUE);

        float a = 123.456789012345678f;
        double b = 123.456789012345678;
        System.out.printf("a is %.99f %n", a);
        System.out.printf("b is %.99f %n", b);
        System.out.println("a is " + a);
        System.out.println("b is " + b);

        //BigDecimal and Floating Point Accuracy

        BigDecimal t = new BigDecimal("123.4567890123456789012345678");
        System.out.printf("t is %.99f %n", t);

        System.out.println("f is " + a);
        System.out.println("d is " + b);

        BigDecimal z = new BigDecimal("123.4567890123456789012345678");
        System.out.printf("t is %.99f %n", t);

        //  Big decimal Accuracy

        double result3 = 0.1 * 7;
        double result4 = 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1 + 0.1;

        System.out.printf("result1 is %.99f %n", result3);
        System.out.printf("result2 is %.99f %n", result4);

        double difference = result3 - result4;
        System.out.printf("The difference is %.99f %n", difference);

        // Expressions and boolean expressions

        boolean checkResult = result3-result4 == 0;
        System.out.println("Checkresult: %n" + checkResult);

        // Boolean expression and compound

        int cucumber = 18;
        int cherry = 9;
        double cucumberPrice = 12.60;
        double cherryPrice = 4.50;

        System.out.println(cucumber == cherry);
        System.out.println(cucumber != cherry);

        System.out.printf ("%d > %d is %s %n", cucumber, cherry, cucumber > cherry);
        System.out.printf ("%d < %d is %s %n", cucumber, cherry, cucumber < cherry);
        System.out.printf ("%d >= %d is %s %n", cucumber, cherry, cucumber >= cherry);
        System.out.printf ("%d <= %d is %s %n", cucumber, cherry, cucumber <= cherry);

        System.out.printf("Reducing apple cost: %s %n", (cucumber > cherry) || (cucumberPrice > cherryPrice));

        // Boolean variables

        int apples = 6;
        int orange = 9;
        double applePrice = 12.60;
        double orangePrice = 4.50;

        boolean moreApples;
        boolean applesAreDearer;

        moreApples = (apples > orange);
        applesAreDearer = (apples > orangePrice);
        System.out.printf("we have more apples: %s %n", moreApples);
        System.out.printf("Apples are dearer: %s %n", applesAreDearer);

        System.out.printf("Reducing cost of apples: %s %n", (moreApples && applesAreDearer));
        System.out.printf("Reducing cost of apples: %s %n", (moreApples ||applesAreDearer));

        boolean moreApplesAndDearer = moreApples && applesAreDearer;
        boolean moreApplesOrDearer = moreApples || applesAreDearer;

        System.out.printf("Reducing cost of apples: %s %n",moreApplesAndDearer);
        System.out.printf("Reducing cost of apples: %s %n",moreApplesOrDearer);

        //Clases and class istances

        Car myCar = new Car("Tim's car");
        Car anotherCar = new Car("The Batmobile");

        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        myCar.accelerate();
        anotherCar.brake();
        anotherCar.brake();
    }
}
class Car {
    private int speed = 0;
    private String name;

    public Car(String carName){
        name = carName;
    }
    public void accelerate(){
        speed++;
        System.out.printf("%s is going %d kilometres per hour.%n",name, speed);
    }

    public void brake(){
        speed--;
        System.out.printf("%s is going %d kilomeetres per hour. %n",name, speed);
    }
}

