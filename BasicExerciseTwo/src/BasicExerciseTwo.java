public class BasicExerciseTwo {
    public static void main(String[] args) {
//        printYearsAndDays(641232);
    }

    public static double AreaCaculator (double radius) {
        if (radius < 0) return -1;
        double pi = 3.14159;
        return radius*radius*pi;
    }

    public static double AreaCaculator (double x, double y) {
        if (x < 0 || y< 0) return -1;
        return x*y;
    }

    public static void printYearsAndDays (long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
        }
        else {
            long XX = minutes;
            int YY = (int) (minutes/525600);
            int ZZ = (int) (minutes%525600)/ (60*24);
            System.out.println(XX+" min = "+YY+" y and "+ZZ+" d");
        }
    }

    public static void printEqual (int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
        } else if (a==b && b==c) {
            System.out.println("All numbers are equal");
        } else if (a!=b && b!=c && a!=c) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }

    public static boolean isCatPlaying (boolean summer, int temperature) {
        if (summer && temperature >= 25 && temperature <= 45) {
            return true;
        } else if (!summer && temperature >=25 && temperature <=35) {
            return true;
        }
        return false;
    }
}
