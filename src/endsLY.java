public class endsLY {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(ends("Helloly"));
    }

    public static boolean ends(String str) {
        int l = str.length();
        String newString = "ly";

        if (l < 2)
            return false;
        else if (newString.equals(str.substring(l-2,l)))
            return true;
        else
            return false;
    }
}
