import java.util.Scanner;
import java.util.ArrayList;

public class code{
    static Scanner sc = new Scanner(System.in);
    public static void leanier_equation(){
        ArrayList<Double> mynum = new ArrayList<Double>();
        ArrayList<String> mychar = new ArrayList<String>();
        ArrayList<Double> alladdsubnum = new ArrayList<Double>();
        System.out.println("enter the no of elements in the equation first");
        int noofvalue = sc.nextInt();

        System.out.println("please enter the value first and the *,-,+,/ or %");
        int i = 0;
        int j = 1;
        int k = 0;
        while (i < noofvalue) {
            ArrayList<Double> h = new ArrayList<Double>();
            System.out.println("enter the value");
            Double value = sc.nextDouble();
            mynum.add(value);    
            while ( j<noofvalue) {

                System.out.println("enter the processor");
                String value1 = sc.next();
                mychar.add(value1);
                j++;
                break;
            } 
            i++;
        }   
        
        String add = new String("+");
        String mul = new String("*");
        String div = new String("/");
        String sub = new String("-");
        String modu = new String("%");
        if (mychar.get(k).equals(mul) ) {
            double mulno = mynum.get(k) * mynum.get(k+1);
            
            if (mychar.get(k-1) == add || mychar.get(k-1) == sub ) {
                
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hi, This program is to solve some maths equations");
        
        leanier_equation();
    }
}