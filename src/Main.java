import java.sql.SQLOutput;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        String courseName = "Learn C# for Beginners Crash Course";
        String message = "Welcome ";

        // concatenate 2 strings

        String fullMessage = message + courseName;
        System.out.println(fullMessage);

        //use string format

        String fullMessage2 = String.format("%s%s", message, courseName);
        System.out.println(fullMessage2 );

        //use printf
        System.out.printf("Hello, and %s the %s.%n", message, courseName);

        for (int i = 0; i < 10; i++){
            char character = courseName.charAt(i);
            System.out.println(character);
        }

        System.out.printf("%n");

        System.out.println(courseName.charAt(0));
        System.out.println(courseName.charAt(2));

        for (int i = 1 ; i < 5; i++){
            System.out.print(courseName.charAt(i));
        }

        System.out.println();

        // Lowercase and Uppercase

        int position = -1;

        do {
            position = indexOfIgnoreCase(courseName, " c", position + 1);

            if (position != -1) {
                courseName = replaceByIndex(courseName, position, " c".length(), " Java");
            }
        } while (position != -1);

        String fixedString = courseName.replace(" Java", " C");
        System.out.println(fixedString);

        String first = "This is a String";
        String second = "This is a String";

        // Value and Reference Types

        int x = 5;
        int y = x;
        System.out.printf("x = %d, y = %d %n", x, y);
        System.out.printf("x is the same as y: %s %n", x == y);

        String third = first;
        System.out.printf("first: %s %n",first);
        System.out.printf("third: %s %n", third);
        System.out.printf("first is the same as third: %s %n",first == third);

        System.out.println();

        // Strings are immutable
        first = first.replace(" ", "_");
        System.out.printf("first: %s %n",first);
        System.out.printf("third: %s %n", third);
        System.out.printf("first is the same as third: %s %n",first == third);
        System.out.printf("first.equals(third): %s %n", first.equals(third));

        //Appended, Delete and Method Chaining

        StringBuilder fourth = new StringBuilder("This is a String");
        StringBuilder fifth = new StringBuilder("This is a String");

        System.out.printf("fourth: %s %n", fourth);

        System.out.println("clearing fourth");
        fourth.delete(0,fourth.length());
        System.out.printf("fourth: *%s* %n",fourth);

        fourth.append("Another String");
        System.out.printf("fourth: *%s* %n",fourth);


    }
    private static int indexOfIgnoreCase(String text, String searchText, int fromIndex){
        String textLowerCase = text.toLowerCase();
        String searchTextLowerCase = searchText.toLowerCase();
        return textLowerCase.indexOf(searchTextLowerCase,fromIndex);
    }

    //Replace a String

    private static String replaceByIndex(String original, int start, int length, String replacement){
        String toRemove = original.substring(start, start + length);
        return original.replaceFirst(toRemove, replacement);
    }


}