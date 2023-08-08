import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //return true if the first number or last one is 6
        System.out.println(firstLast6.firstLast(new int[]{1,3,4}));

        //return true if the first number or last one from a is the same with first or second from b array
        System.out.println(commonEnd.common(new int[]{1,2,3}, new int[]{7,3}));

        // return reverse for an array
        System.out.println(Arrays.toString(reverse3.reverse2(new int[]{1, 2, 3})));

        //2 arrays of 3 numbers return 1 array with the middle of 2 arrays
        System.out.println(Arrays.toString(middleWay.middle(new int[]{1, 2, 3}, new int[]{4, 6, 7})));

        // return true if array does not contain a 2 or 3.
        System.out.println(no23.no(new int[]{4,5}));

        //return middle of an array
        System.out.println(Arrays.toString(makeMiddle.make(new int[]{1, 2, 3, 4})));

        // return an array with middle 3 numbers of a string
        System.out.println(Arrays.toString(midThree.mid(new int[]{1, 2, 3, 4})));

    }
}