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

        // verify if the last digit of a number is the same with the last number ot the other one
        System.out.println(lastDigit.last(13,23, 44));

        // verify if the num is multiply of 11 and if the num%11 == 0 or 1
        System.out.println(specialEleven.special(24));

        // verify if speed is between intervals
        System.out.println(caughtSpeeding.caught(60,true));

        // verify if the sum/dif/num is 6
        System.out.println(love6.love(3,6));

        // verify if the num is multiply of 20 and return 1 or 2
        System.out.println(more20.more(22));

        // verify the stylish for a restaurant
        System.out.println(dateFashion.date(5,5));

    }

}