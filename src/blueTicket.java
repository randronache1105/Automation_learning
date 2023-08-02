public class blueTicket {
    public static int blue(int a, int b, int c) {
        int sum = 0;
        int ab = a + b;
        int bc = b + c;
        int ac = a + c;

        if(ab == 10 || bc == 10 || ac == 10)  return 10;
        else
        if(ab - bc == 10 || ab - ac == 10) return 5;
        else return 0;
    }
}
