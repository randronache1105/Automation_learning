public class Main {
    public static void main(String[] args) {

        //Operators

        int answer = (7+3)*4;
        System.out.println(answer);

        double radius = 12.0;
        double area = Math.PI * radius *radius;
        System.out.printf("area is: %s %n", area);

        int x = 3;
        int y = x++;
        System.out.printf("Using x++, x is %s and y is %s.%n", x, y);

        x=3;
        y=++x;
        System.out.printf("Using x++, x is %s and y is %s.%n", x, y);

        System.out.println("Don't do this!");
        x = 3;
        y = ++x - x++;
        System.out.printf("++x - x++ gives: x is %s and y is %s.%n", x, y);
        // ++x - x++ gives: x is 5 and y is 0

        x = 3;
        y = x++ - ++x;
        System.out.printf("x++ - ++x gives: x is %s and y is %s.%n", x, y);
        // x++ - ++x gives: x is 5 and y is -2

        //Other way to increment/decrement the operators
        int z = 3;
        int q = z;
        z++;
        System.out.printf("Using z++, z is %s and q is %s.%n", z, q);

        z = 3;
        z++;
        q = z;
        System.out.printf("Using ++z, z is %s and q is %s.%n", z, q);

        //Operator Precedence

        double b = 12 * 3 / 4.0;
        double c = (12 * 3) / 4.0;
        double d = 12 * (3 / 4.0);
        System.out.printf("%s %s %s %n", b, c, d);

        double e = 12.0 / 3.0 / 4.0;
        double f = (12.0 / 3.0 )/ 4.0;
        double g = 12.0 / (3.0 / 4.0);
        System.out.printf("%s %s %s %n", e, f, g);

        int h = 12+ 3 * 4;
        int i = (12+ 3) * 4;
        int j = 12+ (3 * 4);
        System.out.printf("%s %s %s %n", h, i, j);

        //Remainder Operator

        int k = 12;
        int l = 3;

        if (k % l ==0){
            System.out.printf("%s divides exactly into %s%n",l,k);
        } else{
            System.out.printf("%s does not divide exactly into %s%n",l,k);
        }

        // Relational and Conditional Operators

        int second = 31;
        int minute = 1;

        if ((minute < 59) && ((second +1) > 59)){
            minute++;
        }

        // Short Circuit Evaluation

        int aa = 12;
        int bb = 0;

        if(bb != 0) {
            int cc = divideTwoNumbers(aa, bb);

            if (cc == 2) {
                System.out.println("we've found a 2.");
            }
        }

    }
    private static int divideTwoNumbers(int m, int n){
        return m / n;

    }
}

