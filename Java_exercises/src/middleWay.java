public class middleWay {
    public static int[] middle(int[] a, int[] b) {
        int[] myArray = new int[2];

        myArray[0] = a[a.length/2];
        myArray[1] = b[b.length/2];
        return myArray;
    }

}
