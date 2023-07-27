public class nonStart {

    public static void main(String[] args) {
        Start2("HELLOO", "TEL");
        System.out.println(Start2("Helloo", "Tel"));
    }
        public static String Start2 (String a, String b){
            String newString = new String();
            newString = newString + a.substring(1) + b.substring(1);
            return newString;
        }

    }