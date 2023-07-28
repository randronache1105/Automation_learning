public class extraEnd {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(extra("abafvva"));
    }


    public static String extra(String str) {
        String newString = new String();
        if(str.length() < 2) return str + str + str;
        else{
            newString = newString + str.substring(str.length() - 2);
            return newString + newString + newString;
        }
    }

}
