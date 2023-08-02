public class nearTen {
    public static boolean near(int num) {
        if (num % 10 < 3 || num % 10 >= 8)
            return true;
        else return false;
    }

}
