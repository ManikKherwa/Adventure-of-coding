import java.util.Scanner;
public class addition {
    int x,y,sum;
    public static void main(String[] args) {
        Scanner myobj = new Scanner(System.in);
        System.out.println("Enter the value of x :");
        int x = myobj.nextInt();
        System.out.println("Enter the value of y :");
        int y = myobj.nextInt();
        int sum = x +y ;
        System.out.println("Sum of the value is:");
        System.out.println(sum);
        myobj.close();
    }
}
