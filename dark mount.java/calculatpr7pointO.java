import java.util.Scanner;
import java.util.ArrayList;

public class calculatpr7pointO {

    static Scanner sc = new Scanner(System.in);

    public static void smallinput() {

        System.out.println("Enter 1 to see usermanual.");
        System.out.println("Enter 2 to see controll keys.");
        System.out.println("Enter 3 to continue.");
      
        System.out.println("\nEnter the input:-");

        int input = sc.nextInt();
 
        switch (input) {
            case 1:
                usermanual();

            case 2:
                controlls();

            case 3:
                input();
                break;
            default:
            System.out.println("\n Plz enter valid input");
                smallinput();
                break;
        }
    }

    public static void usermanual() {
        System.out.println("The founder of our program and company 'Dream Oasis' are:");
        System.out.println("1)Mr.Manik Kherwa");
        System.out.println("2)Mr.Hunar Sandhu");
        
        System.out.println("");   
        System.out.println("In this program You can find log, cos, tan, sin and also square, cube and so on.... also square root, cube root of no's \n you can add,sub,mul,divide the no's ");
        System.out.println("To find these you have to just enter the name such as log, cos, square, square root \n For addition, subtraction, division, multiplication you have to just enter keyword 'calculation' ");
        System.out.println("\n Then you have to enter the data as directed. ");
        System.out.println("Thankyou");
        System.out.println("");
    }

    public static void controlls() {
        System.out.println("Here in this program you can enter some keywords or signs to controll the calculator easily ");
        System.out.println("Those signs are:");
        System.out.println("1)Enter this sign '!' to quit program. ");
        System.out.println("2)Enter this sign '?' to open user manual");
        System.out.println("3)Enter this sign '&' to restart program");
    }

    public static void input() {
        System.out.println("\nMain input area");
        System.out.println("\nplz enter the cal type you want to do");
        String input = sc.next();
        switch (input) {
            case "calculation":
                expressioninput();
                break;

            case "log":
               log();
                break;

            case "cos":
                cos();
                break;

            case "tan":
                tan();
                break;
        
            case "sin":
                sin();
                break;
        
        
            case "&":
                main(null);
                break;
        
        
            case "?":
                usermanual();
                break;
        
        
            case "!":
                System.exit(0);
                break;

            case "controlls":
                controlls();
                break;
        
            default:
                input();
                break;
        }
    }

    static ArrayList<Double> expressionarray = new ArrayList<Double>();
    static ArrayList<Character> characterarray = new ArrayList<Character>();

    public static void noinput() {
        System.out.println("Plz enter no");
        try {
            Double no = sc.nextDouble();
                expressionarray.add(no);
        }
        catch (Exception e) {
            System.out.println("Plz enter the valid expression");
            noinput();
        }
    }

    public static void signinput() {
        System.out.println("Plz enter sign");
        try {
            System.out.println("enter char");
            char sign = sc.next().charAt(0);
            if (sign == '*'  || sign == '-' || sign == '/' || sign == '+' ) {
                characterarray.add(sign);
            } else {
                System.out.println("Plz enter the valid sign");
                signinput();
            }
        } catch (Exception e) {
            System.out.println("Plz enter the valid expression");
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

    public static void log() {
        System.out.println("This program can tell you the log value of any no");
        int i = 1;
        while (i>0) {
        System.out.println("Please enter any int you want to to be processed:");
        double x = sc.nextDouble();
        System.out.println("log value of" + x + "is:");
        System.out.println(Math.log(x));
        System.out.println("to stop entering no's for log  enter 2 else 1");
        int y = sc.nextInt();
            if (y == 2) {
                input();
                break;
            }
        }
    }
    
    
    public static void cos() {
        System.out.println("This program can tell you the cos value of any no");
        int i = 1;
        while (i>0) {
        System.out.println("Please enter any int you want to to be processed:");
        double x = sc.nextDouble();
        System.out.println("cos value of" + x + "is:");
        System.out.println(Math.cos(x));
        System.out.println("to stop entering no's for cos enter 2 else 1");
        int y = sc.nextInt();
            if (y == 2) {
                input();
                break;
            }
        }
    }
    
    public static void tan() {
        System.out.println("This program can tell you the tan value of any no");
        int i = 1;
        while (i>0) {
        System.out.println("Please enter any int you want to to be processed:");
        double x = sc.nextDouble();
        System.out.println("tan value of" + x + "is:");
        System.out.println(Math.tan(x));
        System.out.println("to stop entering no's for tan  enter 2 else 1");
        int y = sc.nextInt();
            if (y == 2) {
                input();
                break;
            }
        }
    }
    
    public static void sin() {
        System.out.println("This program can tell you the sin value of any no");
        int i = 1;
        while (i>0) {
        System.out.println("Please enter any int you want to to be processed:");
        double x = sc.nextDouble();
        System.out.println("sin value of" + x + "is:");
        System.out.println(Math.sin(x));
        System.out.println("to stop entering no's for sin  enter 2 else 1");
        int y = sc.nextInt();
            if (y == 2) {
                input();
                break;
            }
        }
    }

    public static void power() {
        System.out.println("This program can tell you the ans of power of any no");
        int i = 1;
        while (i>0) {
        System.out.println("Please enter the no and then power you want");
        System.out.println("\nPlz enter the base value");
        double x = sc.nextDouble();
        System.out.println("\nPlz enter the exponent value");
        double z = sc.nextDouble();
        System.out.println(" value of base " + x + " with the exponent " + z +" is:");
        System.out.println(Math.pow(x,z));
        System.out.println("to stop entering no's for sin enter 2 else 1");
        int y = sc.nextInt();
            if (y == 2) {
                input();
                break;
            }
        }
    }

    public static void root() {
        System.out.println("This program can tell you the ans of squareroot or cuberoot of any no");
        for (int i = 0; i < 1; i=i+0) {
            System.out.println("Plz enter you want squareroot or cuberoot ");
            System.out.println("Enter exit to exit the root program ");
            String input = sc.next();
            if (input == "squareroot") {
                int j = 1;
                while (j>0) {
                System.out.println("Please enter the no you want");
                System.out.println("\nPlz enter the value");
                double z = sc.nextDouble();
                System.out.println("squareroot of the no " + z +" is:");
                System.out.println( Math.sqrt(z));
                System.out.println("to stop entering no's for sin enter 2 else 1");
                int y = sc.nextInt();
                    if (y == 2) {
                        input();
                        break;
                    }
            }
           
            if (input == "cuberoot") {
                int k = 1;
                while (k>0) {
                System.out.println("Please enter the no you want");
                System.out.println("\nPlz enter the value");
                double z = sc.nextDouble();
                System.out.println("cuberoot of the no " + z +" is:");
                System.out.println( Math.cbrt(z));
                System.out.println("to stop entering no's for sin enter 2 else 1");
                int y = sc.nextInt();
                    if (y == 2) {
                        input();
                        break;
                    }
                }    
            }

            if(input == "exit"){
                input();
                break;
            }

        }
    }      
}   
    
    public static void main(String[] args) {
        
        System.out.println("Hello! \n I am Jarvis a computer program to calculate");
               
        smallinput();
        
        System.out.println("");
        System.out.println("Thanks for giving us this valuable chance for serving you \n Have a nice day");
        System.out.println("");

        expressioninput();

    sc.close();    
    }
   
}