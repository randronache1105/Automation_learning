public class twoAsOne {
    public static boolean two(int a, int b, int c) {
        int ab = a+b;
        int bc = b+c;
        int ac = a+c;

        if(ab == c || bc == a || ac == b) return true;
        else return false;
    }
}
