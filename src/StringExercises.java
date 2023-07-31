public class StringExercises {
    public static boolean frontAgain(String str) {
        if(str.length() < 2) return false;
        if(str.substring(0,2).equals(str.substring(str.length() - 2))) return true;
        else return false;
    }

    public static String without2(String str) {
        String newString = new String();
        if(str.length() < 2) return str;
        else if (str.length() == 2) return "";
        else if(str.substring(0,2).equals(str.substring(str.length() - 2, str.length()))){
            newString = str.substring(2, str.length());
            return newString;

        }
        else return str;
    }
}
