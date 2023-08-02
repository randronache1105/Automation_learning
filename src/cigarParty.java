public class cigarParty {
    public static boolean cigar(int cigars, boolean isWeekend) {
        if(isWeekend == true && cigars >= 40) return true;
        else{
            if((!isWeekend) && cigars >= 40 && cigars <= 60)
                return true;
            else return false;
        }

    }
}
