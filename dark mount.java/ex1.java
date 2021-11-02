import java.util.Scanner;
import java.util.ArrayList;

public class ex1 {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Double> expressionarray = new ArrayList<Double>();
    static ArrayList<Character> characterarray = new ArrayList<Character>();

    
    public static void noinput() {
        System.out.println("Plz enter no");
        
            Double no = sc.nextDouble();
                expressionarray.add(no);

    
        }
    

    public static void signinput() {
        System.out.println("Plz enter sign");
            char sign = sc.next().charAt(0);
            if (sign == '*'  || sign == '-' || sign == '/' || sign == '+' ) {
                characterarray.add(sign);
            } else {
                System.out.println("Plz enter the valid sign");
                signinput();
            }
    }

    public static void expressioninput() {
        System.out.println("Calculation area :-");
        System.out.println("\nHere you can add, sub, multiply or divide no's and enter the equation to solve");
        System.out.println("Enter the data as directed ");
        System.out.println("Plz enter the noof values in the equation ");

        int noofvalues = sc.nextInt();
        for (int i = 1; i < noofvalues; i++) {     
           noinput();
           signinput(); 
           
        }
        noinput();
        System.out.println(expressionarray);
        System.out.println(characterarray);
        mulprocessor();
    }

    public static void mulprocessor() {
        
        for (int i = 0; i < characterarray.size(); i++) {
            if (characterarray.get(i) == '*') {
                System.out.println(expressionarray.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray.get(i+1));
                Double k =expressionarray.get(i) * expressionarray.get(i+1);
                expressionarray.set(i+1, k);
                System.out.println(expressionarray);
                expressionarray.remove(i);
                System.out.println(expressionarray);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray);
        System.out.println(characterarray);
        divprocessor();
    }

    public static void divprocessor() {
        
        for (int i = 0; i < characterarray.size(); i++) {
            if (characterarray.get(i) == '/') {
                System.out.println(expressionarray.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray.get(i+1));
                Double k =expressionarray.get(i) / expressionarray.get(i+1);
                expressionarray.set(i+1, k);
                System.out.println(expressionarray);
                expressionarray.remove(i);
                System.out.println(expressionarray);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray);
        System.out.println(characterarray);
        addprocessor();
    }

    public static void addprocessor() {
        
        for (int i = 0; i < characterarray.size(); i++) {
            if (characterarray.get(i) == '+') {
                System.out.println(expressionarray.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray.get(i+1));
                Double k =expressionarray.get(i) + expressionarray.get(i+1);
                expressionarray.set(i+1, k);
                System.out.println(expressionarray);
                expressionarray.remove(i);
                System.out.println(expressionarray);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray);
        System.out.println(characterarray);
        subprocessor();
    }

    public static void subprocessor() {
        
        for (int i = 0; i < characterarray.size(); i++) {
            if (characterarray.get(i) == '-') {
                System.out.println(expressionarray.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray.get(i+1));
                Double k =expressionarray.get(i) - expressionarray.get(i+1);
                expressionarray.set(i+1, k);
                System.out.println(expressionarray);
                expressionarray.remove(i);
                System.out.println(expressionarray);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray);
        System.out.println(characterarray);
        finalans();
    }

    public static void finalans() {
        System.out.println(expressionarray);
        System.out.println(expressionarray.get(0));
    }

    public static void main(String[] args) {
        expressioninput();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  
    } 
}
