public class StringExercises {
    public static boolean frontAgain(String str) {
        if(str.length() < 2) return false;
        if(str.substring(0,2).equals(str.substring(str.length() - 2))) return true;
        else return false;
    }
}
