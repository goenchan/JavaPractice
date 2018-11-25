public class BasicExerciseTwo {
    public static void main(String[] args) {

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
}
