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

        //Given a string, return the string made of its first two chars,
        // so the String "Hello" yields "He"
        System.out.println(StringExercises.firstTwo("Hello"));

        //Given 2 strings, a and b, return a string of the form short+long+short,
        // with the shorter string on the outside and the longer string on the inside.
        System.out.println(StringExercises.comboString("aaa", "b"));

        //Given a string, return a "rotated right 2"
        // version where the last 2 chars are moved to the start
        System.out.println(StringExercises.right2("Hello"));

        //Given a string of even length, return a string made of the middle two chars,
        // so the string "string" yields "ri"
        System.out.println(StringExercises.middleTwo("Helloppoo"));

        //Given a string and an index, return a string length 2 starting at the given index.
        System.out.println(StringExercises.twoChar("java", 2));

        //Given a string, return a string length 2 made of its first 2 chars.
        System.out.println(StringExercises.atFirst("Helloppoo"));

    }

}
