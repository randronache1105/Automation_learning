public class StringExercises {
    public static boolean frontAgain(String str) {
        if(str.length() < 2) return false;
        if(str.substring(0,2).equals(str.substring(str.length() - 2))) return true;
        else return false;
    }

    public static String without2(String str) {
        String newString = new String();
        if(str.length() < 2) return str;
        else if (str.length() == 2) return "";
        else if(str.substring(0,2).equals(str.substring(str.length() - 2, str.length()))){
            newString = str.substring(2, str.length());
            return newString;

        }
        else return str;
    }

    public static String withoutX(String str) {
        if (str.length() == 0)
            return str;
        if (str.length() == 1){
            if (str.charAt(0) == 'x')
                return "";
            else
                return str;
        }
        if (str.charAt(0) == 'x')
            str = str.substring(1, str.length());

        if (str.charAt(str.length() - 1) == 'x')
            str = str.substring(0, str.length() -1 );
        return str;
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag +">" + word + "</" + tag +">";
    }

    public static String firstTwo(String str) {
        if(str.length() == 0) return "";
            else if (str.length() < 2) return str;
                else return str.substring(0,2);
    }

    public static String comboString(String a, String b) {
        if(a.length() == 0) return b;
            else if(b.length() == 0) return a;

        if(a.length() > b.length()) return  b + a +b;
            else return a + b + a;
    }

    public static String right2(String str) {
        if(str.length() < 2) return "";
        else if (str.length() == 2) return str;
        else return str.substring(str.length() - 2, str.length()) + str.substring(0, str.length() - 2);
    }

    public static String middleTwo(String str) {
        if(str.length() < 2) return "";
        else return str.substring((str.length()/2) -1, (str.length()/2) +1);
    }

    public static String twoChar(String str, int index) {
        if (str.length() <= index + 1 || index < 0) return str.substring(0,2);
        else return str.substring(index, index + 2);
    }

    public static String atFirst(String str) {
        if(str.length() == 1) return str.substring(0,1) + "@";
        if(str.length() == 0) return "@@";
        else return str.substring(0,2);
    }

    public static String lastTwo(String str) {
        if(str.length()==0) return "";
        if(str.length() < 2) return str.substring(str.length() - 1, str.length());
        else return str.substring(0, str.length()-2) + str.substring(str.length() - 1, str.length()) + str.substring(str.length() - 2, str.length() - 1);
    }

    public static String minCat(String a, String b) {
        if (a.length() == b.length())
            return a+b;
        if (a.length() > b.length()){
            int diff = a.length() - b.length();
            return a.substring(diff, a.length()) + b;
        } else {
            int diff = b.length() - a.length();
            return a + b.substring(diff, b.length());
        }
    }

    public static String withoutX2(String str) {
        String newString = new String();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) != 'x')
                newString += str.charAt(i);
            else if (i == 1 && str.charAt(i) != 'x')
                newString += str.charAt(i);
            else if (i > 1)
                newString += str.charAt(i);
        }
        return newString;
    }

    public static String deFront(String str) {
        String newString = new String();
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 && str.charAt(i) == 'a')
                newString = newString + 'a';
            else if (i == 1 && str.charAt(i) == 'b')
                newString = newString + 'b';
            else if (i > 1)
                newString = newString + str.charAt(i);

        }
        return newString;
    }






}
