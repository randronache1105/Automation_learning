
public class makeOutWord {
    public static void main(String[] args) {
        word("<<>>","YAY");
        System.out.println(word("<<>>","YAY"));
    }

    public static String word(String out, String word) {
        String newString = new String();
        int index = 1;//stim unde se splituieste primul string
        for (int i = 0; i < out.length(); i++ ){
            newString = newString + out.charAt(i);//add the original string character into the new string
            if(i == index){ // insert the string to be inserted into the new string
                newString = newString + word;
            }
        }
        return newString;

        //Second methodd
        // String newString = out.substring(0 , 2) + word + out.substring(2,4);
        // return newString;

    }
}
