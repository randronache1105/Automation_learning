public class seeColor {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(see("REDxxx"));
    }

    public static String see(String str) {
        if(str.startsWith("red") == true) return "red";
            if(str.startsWith("RED") == true) return "red";
        if(str.startsWith("blue") == true) return "blue";
            if(str.startsWith("BLUE") == true) return "blue";
        else return "";
    }

}
