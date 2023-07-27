public class theEnd {
    public static void main(String[] args) {
        End("HELLOO", true);
        System.out.println(End("Helloo", true));
    }

    public static String End(String str, boolean front) {
        String newString = new String();
        if(front == true){
            return newString = newString + str.charAt(0);
        }else {
            return newString = newString + str.charAt(str.length() - 1);
        }
    }

}
