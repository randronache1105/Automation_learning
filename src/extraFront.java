public class extraFront {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(extra("REDxxx"));
    }


    public static String extra(String str) {
        if(str.length() < 2) return str + str + str;

        else{
            String newString = str.substring(0,2);
            return newString = newString + newString + newString;
        }

    }
}
