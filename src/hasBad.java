public class hasBad {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(has("xxbad"));
    }

    public static boolean has(String str) {
        if(str.length() < 3)
            return false;
        else if ((str.substring(0,3)).equals("bad"))
            return true;
        else if (str.length() > 3){
            if ((str.substring(1,4)).equals("bad"))
                return true;
        }
        return false;
    }


}
