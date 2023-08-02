public class maxMod5 {
    public static int maxMod(int a, int b) {
        if(a == b) return 0;
        else if (a % 5 == b % 5)
            return Math.min(a,b);
        return Math.max(a,b);
    }

}
