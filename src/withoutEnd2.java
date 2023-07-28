public class withoutEnd2 {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(withouEnd("abafvva"));
    }

    public static String withouEnd(String str) {
        String newString = new String();

        if(str.length() < 2) return "";

        else{
            newString = newString + str.substring(1, str.length() -1);
            return newString;
        }
    }


}
