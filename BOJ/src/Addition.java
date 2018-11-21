import java.util.Scanner;

public class Addition {
    public static void main (String args[]) {
//        BasicAdditionCase();
        UnlimitedAdditionCase();
    }
//1000
    public static void BasicAdditionCase () {
        Scanner sc = new Scanner(System.in);
        int a, b;

        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);

        sc.close();
    }
//10951
    public static void UnlimitedAdditionCase () {
        Scanner sc = new Scanner(System.in);
        int a, b;

        while (sc.hasNext()) {


        a = sc.nextInt();
        b = sc.nextInt();
        System.out.println(a+b);
        }
        sc.close();
    }
}
