public class BasicExercise {
    public static void main(String[] args) {

    }

    //1.
    public static void printMegaBytesAndKiloBytes(int kilo) {
        if (kilo < 0) {
            System.out.println("Invalid Value");
        } else {
            int mega = kilo / 1024;
            int remainder = kilo % 1024;
            System.out.println(kilo + " KB = " + mega + " MB and " + remainder + " KB");
        }
    }

    //2.
    public static boolean bark(boolean barking, int hourOfDay) {
        if (barking == false || hourOfDay < 0 || hourOfDay > 23) {
            return false;
        }
        if (hourOfDay < 8 || hourOfDay > 22) {
            return true;
        }
        return false;
    }

    //3.
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    //4.
    public static boolean areEqualByThreeDecimalPlaces(double numOne, double numTwo) {
//            Java decimal dividing calculation is really weird. cast it to integer where there are no such issue.
        if ((int) (numOne * 1000) == (int) (numTwo * 1000)) {
            return true;
        }
        return false;
    }

    //5.
    public static boolean hasEqualSum(int one, int two, int three) {
        if (one + two == three) {
            return true;
        }
        return false;
    }

    //6.
    public static boolean hasTeen(int one, int two, int three) {
        if ((one <= 19 && one >= 13) || (two <= 19 && two >= 13) || (three <= 19 && three >= 13)) {
            return true;
        }
        return false;
    }
}
