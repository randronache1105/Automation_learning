public class nTwice {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(Twice("abafvva",3));
    }

    public static String Twice(String str, int n) {
        String newString = new String();
        newString = str.substring(0,n) + str.substring(str.length() - n, str.length());
        return newString;
    }
}
