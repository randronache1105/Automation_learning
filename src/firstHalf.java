public class firstHalf {
    public static void main(String[] args) {
        first("HELLOO");
        System.out.println(first("Helloo"));
    }

    public static String first(String str) {
        String newString = new String();
        for(int i = 0; i < str.length() / 2; i++){
            newString = newString + str.charAt(i);
        }
        return newString;

    }
}
