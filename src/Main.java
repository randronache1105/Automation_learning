//Widening casting

public class Main {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println(myInt);      // Outputs 9
        System.out.println(myDouble);   // Outputs 9.0

        double antDouble = 9.78d;
        int antInt = (int) antDouble;

        System.out.println(antDouble);
        System.out.println(antDouble);
    }
}