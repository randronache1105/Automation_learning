import java.util.Scanner;

public class Switch {

public static String switchEx() {


    Scanner scanner2 = new Scanner(System.in);
    String userChoice2;

    System.out.println("Please choose one of the following options");
    System.out.println("1 - Cappucino");
    System.out.println("2 - Latte");
    System.out.println("3 - Americano");
    System.out.println("4 - Mocha");
    System.out.println("5 - Macchiato");
    System.out.println("6 - Espresso");
    System.out.println("Q - Quit the program");

    do {
        userChoice2 = scanner2.nextLine();
        userChoice2 = userChoice2.toLowerCase();
        System.out.println("You chose " + userChoice2);
        switch (userChoice2) {
            case "1":
                System.out.println("Making Cappucino...");
                System.out.println("Steam the milk");
                System.out.println("Froth the milk");
                System.out.println("Making espresso");
                System.out.println("Add the milk to the espresso");
                break;

            case "2":
                System.out.println("Making Latte...");
                System.out.println("Make espresso");
                System.out.println("Steam the milk");
                System.out.println("Add the milk to the espresso");
                break;

            case "3":
                System.out.println("Making the americano...");
                break;

            case "4":
                System.out.println("Making the Mocha...");
                break;

            case "5":
                System.out.println("Making the Machiatto...");
                break;

            case "6":
                System.out.println("Making the Espresso...");
                break;

            default:
                System.out.println("Returning coins");
                break;

        }

        System.out.println("Dispensing coffee");
        System.out.println("Have a nice day");

    } while (!userChoice2.equals("q"));

    scanner2.close();
//    return userChoice2;

    return userChoice2;
}

}
