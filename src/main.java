public class main {

    public static void main(String[] args) {
        //Return true or false if the first 2 chars in the string also appear at the end of the string
        System.out.println(StringExercises.frontAgain("edited"));

        //Concatenate 2 strings and if the last character of the first string
        //is the same with the first character of the second string to not duplicate it
        System.out.println(conCat.Cat("abafvva","adeaf"));

        //If a length 2 substring appears at both its beginning and end,
        // return a string without the substring at the beginning
        System.out.println(StringExercises.without2("xx"));

        //if the first or last chars are 'x', return the string without those 'x' chars,
        // and otherwise return the string unchanged
        System.out.println(StringExercises.withoutX("xHix"));

        //In this example, the "i" tag makes <i> and </i> which surround the word "Yay".
        System.out.println(StringExercises.makeTags("i", "Hello"));

    }

}
