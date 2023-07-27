public class lastChars {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(last("Helloly", "all"));
    }

    public static String last(String a, String b) {
        String newString = new String();
        if (a.length() ==0) a = "@";
        if (b.length() == 0) b = "@";
        return a.substring(0,1) + b.substring(b.length() - 1 , b.length());
    }

}
