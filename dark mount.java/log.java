import java.util.Scanner;

public class log {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello this is a special program formed by manik for didi ");
        System.out.println("this program can tell you the the log value of any no");
        int i = 10;
        while (i>0) {
        System.out.println("Please enter any int you want to to be processed:");
        double x = sc.nextDouble();
        System.out.println("log value of" + x + "is:");
        System.out.println(Math.log(x));
        System.out.println("to to quit from this program enter 2 else 1");
        int y = sc.nextInt();
        if (y == 2) {
            break;
        }
        }
    }
}
