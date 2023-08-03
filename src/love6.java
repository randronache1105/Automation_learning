public class love6 {
    public static boolean love(int a, int b) {
        int ab = a+b;
        int dif1 = a-b;
        int dif2 = b-a;

        if(ab == 6 || a == 6 || b == 6  || dif1 == 6 || dif2 ==6) return true;
        else return false;
    }
}
