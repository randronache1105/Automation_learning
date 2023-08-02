public class Main {
    public static void main(String[] args) {
        // Return true or false if the cigar number is between 40 and 60 inclusive
        // and even if isWeekend is false and cigars is in that interval return true
        System.out.println(cigarParty.cigar(50, false));

        //Return ab || ac || bc = 10 return 10 or dif ab - bc = 10 || ab - bc = 10 return 5 otherwise return 0;
        System.out.println(blueTicket.blue(10, 2, 3));

        // Return 0 if a=b or return min(a,b) if a%5=b%5 otherwise return max(a,b)
        System.out.println(maxMod5.maxMod(10, 2));

        // verify if however sum of 2 numbers is equal with the third one
        System.out.println(twoAsOne.two(1,2,3));

        // verify if nr of candy >= 2*tea or tea >= 2*candy
        System.out.println(teaParty.tea(4,5));

        // return true or false if num is within 2 of a multiple of 10
        System.out.println(nearTen.near(12));
    }

}