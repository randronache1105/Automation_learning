public class middleThree {

    public static void main(String[] args) {
        //ends("Helloly);
        System.out.println(middle("Helloly"));
    }

    public static String middle(String str) {

        return str.substring(str.length()/2 - 1, str.length()/2 + 2);

    }
}
