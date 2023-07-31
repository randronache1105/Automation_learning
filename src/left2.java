public class left2 {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(left("abafvva"));
    }

    public static String left(String str) {
        String newString = new String();
        if(str.length() < 2) return str;
        else{
            newString = newString + str.substring(2) + str.substring(0, 2);
            return newString;
        }
    }
}
