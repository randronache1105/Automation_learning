public class withoutEnd {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(without("abafvva"));
    }

    public static String without(String str) {
        String newString = new String();

        if(str.length() < 2) return str;

        else{
            newString = newString + str.substring(1, str.length() - 1);
            return newString;
        }
    }
}
