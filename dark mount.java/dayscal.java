import java.util.Scanner;
public class dayscal {

    public static void main(String[] args) {
        long Years , remainder_of_Y , Months , remainder_of_M , Days;
        //input stream
        Scanner no_of_days = new Scanner(System.in);
        //program
        System.out.println("Welcome to this parogram");
        System.out.println("Please enter the no of days you want to convert:");
        int no_of_days1 = no_of_days.nextInt();
        //calculator
        if (no_of_days1>=365) {
            Years = no_of_days1/365;
            //reasult
            System.out.println("No of Years are:");
            System.out.println(Years+"Years");
        }
        remainder_of_Y = no_of_days1 % 365;
        if (remainder_of_Y>=30) {
            Months = remainder_of_Y / 30;
            System.out.println("and No of Months are:");
            System.out.println(Months+"Months");
        }       
        remainder_of_M = remainder_of_Y % 30;
        Days = remainder_of_M;
        if (Days!=0) {
            System.out.println("and No of days are");
            System.out.println(+Days+"Days");
            no_of_days.close();
        }
    }
}