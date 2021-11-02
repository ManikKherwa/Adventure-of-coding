import java.util.*;

/**
 * Calculator2.0
 */
public class Calculator2point0 {
    long sumofthese;

    public static void main(String[] args) {
        System.out.println("This program will help you to calculate numbers if you are not Spock.");
        System.out.println("By the way this follow BODMAS.");
        System.out.println("Fill the numbers as directed.");
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> addarry = new ArrayList<Integer>();
        System.out.println("Addition part.");
        System.out.println("How many numbers you want to add :-");
        int noofnoforsum = sc.nextInt();
        int i = 0;
        int k = 1;
        while (i < noofnoforsum) {
            System.out.println("Please enter the " + k + " value :-");
            int sumvalue = sc.nextInt();
            addarry.add(sumvalue);
            
            
            i++;
            k++; 
        }
        long a = 0;
        for (int b = 0; b < noofnoforsum; b++) {
            a = a + addarry.get(b);
        }
        System.out.println("Sum of the numbers is :-");
        System.out.println(a);

        ArrayList<Long> multarry = new ArrayList<Long>();
        System.out.println("How many numbers you want to mutiply ?");
        long noofvaluemult = sc.nextLong();
        long h = 0;
        long d = 1;
        while (h < noofvaluemult) {
            System.out.println("Enter the " + d + " value please:-");
            long valuemult = sc.nextLong();
            multarry.add(valuemult);
            h++;
            d++;
        }
        long y = 1;
        for (int v = 0; v < noofvaluemult; v++) {
            y = y * multarry.get(v);
        }
        System.out.println("Product of the number(s) is:- ");
        System.out.println(y);


        System.out.println("Substraction part :-");
        System.out.println("IMPORTANT : Do not enter the numbers with this sign (-) in front of them.");
        ArrayList<Integer> subarray = new ArrayList<Integer>();
        int c = 0;
        int v = 1;
        System.out.println("How many numbers do you want to enter ?");
        int noofnoforsub = sc.nextInt();
        while (c < noofnoforsub) {
            System.out.println("Please enter the " + v + " value :-");
            int subtvalue = sc.nextInt();
            subarray.add(subtvalue);
            c++;
            v++;
        }
        long b = 0;
        for (int g = 0; g < noofnoforsub; g++) {
            b = b - subarray.get(g);
        }
        System.out.println("This is the total of all the negative number :-");
        System.out.println(b);
   
        Calculator2point0 myObj = new Calculator2point0();
        myObj.sumofthese = a + b + y;

        System.out.println("Division part.");
        System.out.println("do you want to divide a 'specific' group of numbers or the 'whole' thing ?");
        String option = sc.next();
        switch (option) {
            case "specific":
                specific(myObj.sumofthese);
                break;
            case "whole":
            System.out.println("Enter the Divisor :-");
            int Divisor3 = sc.nextInt();
            System.out.println("The Final Result :-");
            System.out.println(myObj.sumofthese/Divisor3);
            default:
                System.out.println("If it didn't work please Try Again.");
                break;
        }

        sc.close();
    }
    

    public static void specific(Long sumofthese1) {
        Calculator2point0 myObj = new Calculator2point0();
        ArrayList<Integer> specarry = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.println("How many numbers you want in the group ?");
        int noofnoforspec = sc.nextInt();
        int t = 0;
        int d = 1;
        while (t < noofnoforspec) {
            System.out.println("Enter the " + d + " value");
            int specvalue = sc.nextInt();
            specarry.add(specvalue);
            t++;
            d++;
        }
        int h = 0;
        for (int f = 0; f < noofnoforspec; f++) {
            h = h + specarry.get(f);
        }
        System.out.println("Here's the total of the numbers :-");
        System.out.println(h);

        System.out.println("Now enter the divisor :-");
        int divisor = sc.nextInt();

        System.out.println("Here's the result of the 'specific' division :-");
        int resultofspec = h/divisor;
        System.out.println(resultofspec);

        System.out.println("Now you want to 'get' the result or divide the 'whole' ?");
        String option2 = sc.next();
        switch (option2) {
            case "get":
                System.out.println("The Final Result :-");
                System.out.println(myObj.sumofthese);
                System.out.println(resultofspec + sumofthese1);
                break;

            case "whole":
                System.out.println("Enter the Divisor :-");
                int Divisor2 = sc.nextInt();
                System.out.println("The Final Result :-");
                System.out.println(myObj.sumofthese/Divisor2);    
        
            default:
                System.out.println("Please try again now.");
                break;
        }
        sc.close();
        System.out.println("Please use our Software again.");
    }
}