import java.util.Scanner;
import java.util.ArrayList;

public class calculator {
    
    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Double> mularray = new ArrayList<Double>();
    static ArrayList<Double> mulansarray = new ArrayList<Double>();


    static ArrayList<Double> divarray = new ArrayList<Double>();
    static ArrayList<Double> quotientarray = new ArrayList<Double>();
    static ArrayList<Double> divansarray = new ArrayList<Double>();
    static ArrayList<Double> finaldivansarray = new ArrayList<Double>();

    static ArrayList<Double> addarray = new ArrayList<Double>();
    static ArrayList<Double> addansarray = new ArrayList<Double>();
   
    static ArrayList<Double> subarray = new ArrayList<Double>();
    static ArrayList<Double> subansarray = new ArrayList<Double>();
   
    static ArrayList<Double>addsubarray = new ArrayList<Double>();
    static ArrayList<Double>addsubansarray = new ArrayList<Double>();

    public static void  manual() {  System.out.println("");
    System.out.println("");
    System.out.println("Instruction manual");
    System.out.println("");
    System.out.println("Here the some shortcut keys and instructions:-");
    System.out.println("");
    System.out.println("1) To change the type of calculation enter any sign in the sign place");
    System.out.println("2) To get the reasult of full equation enter '=' sign");
    System.out.println("2) To get the reasult of the single equation enter '@' sign");
    System.out.println("3) To restart the program enter '~' sign ");
    System.out.println("4) To quit the program enter '_' sign");
    System.out.println("5) To know about us enter '!' sign");
    System.out.println("");
    System.out.println("6)To display this instruction manual enter '?' ");
    System.out.println("");
    System.out.println("NOTE:- /n These shortcut will be applicable at the place where the input follows '#' sign ");

    input();
    
    }    

    public static void input() {

        for (int i = 0; i < 1; i=i+0) {

        System.out.println("Main input area");
        System.out.println("");
        System.out.println("Enter the Sign");
        System.out.println("#");

        char input = sc.next().charAt(0);

    

        if (input == '-' ) {
            subarray();
        }

        if (input == '/') {
            divarray();
        }

        if (input == '*') {
            mularray();
        }

        if (input == '+') {
            addarray();
        }

        if (input == '=') {
            fullans();
        }

        if (input == '~') {
            main(null);
        }

        if (input == '_') {
             System.exit(0);
        }

        if (input == '!') {
          info();
    } 

        if (input == '&') {
            addsubarray();
    }
}

    }

    public static void info() {
        System.out.println("");
        System.out.println("");
        System.out.println("About Us:-");
        System.out.println("The founder of our program and company 'Dream 11 are:' ");
        System.out.println("1)Mr.Manik Kherwa");
        System.out.println("2)Mr.Hunar Sandhu");
        System.out.println("");
        System.out.println("They are the only stack holders and founders of the company and the future of the world");
        System.out.println("");
        System.out.println("We regularly publish the java programs and sometimes html projects");
        System.out.println("If you like our programs subscribe our youtube channel 'Hunar Sandhu' ");
        System.out.println("");
        System.out.println("Thankyou");

        input();
    }

    public static void mularray() {
        System.out.println("Multiplication part:-");
        System.out.println("plz enter the no and then this '*' sign to continue adding no to multiply  or enter any other sign to shift on that calculation eg '+' '-' '/' ");
        

        int k = 1;
        System.out.println("Enter '+0' to stop entering numbers");
        for (int j = 0; j < 1; j=j+0) {
            
        for (int i = 0; i < 1; i=i+0) {
            System.out.println("Enter the "+ k +" Value");
            double no1 = sc.nextInt();

            if(no1 == +0){
                break;
            }

            mularray.add(no1);

            k++;
            }
            System.out.println("Enter the sign ");
            System.out.print("# ");
            char input = sc.next().charAt(0);
            if (input == '*' ) {
                continue;
            }

            if (input == '/') {
                divarray();
            }

            if (input == '+') {
                addarray();
            }

            if (input == '-') {
                subarray();
            }

            if (input == '=') {
                fullans();
            }
            
            if (input == '&' ) {
                addsubarray();
            }

            if (input == '@') {
                 mulans();
            }

            if (input == '~') {
                main(null);
            }

            if (input == '_') {
                 System.exit(0);
            }

            if (input == '!') {
              info();
        }
    } 
    }
    
    public static void mulans() {
        double mulans = 1;
        for (int mulno = 0; mulno < mularray.size(); mulno++) {
            mulans = mulans * mularray.get(mulno);
        }
        mulansarray.add(mulans);
        mularray.clear();
        System.out.println(mulans);

        input();
    }

    public static void divarray() {
        System.out.println("Division part:-");
        System.out.println("plz enter the no and then this '/' sign to continue adding no to divide and enter '%' to add quotient or enter any other sign to shift on that calculation eg '/' '-' '*' ");
        

        int k = 1;
        
        System.out.println("Enter '+0' to stop entering numbers");
        for (int j = 0; j < 1; j=j+0) {

        for (int i = 0; i < 1; i=i+0) {
            System.out.println("Enter the "+ k +" Value");
            double no1 = sc.nextDouble();

            if(no1 == +0){
                break;
            }

            divarray.add(no1);

           
            k++;

        } 
        System.out.println("Enter the sign ");
        System.out.print("#");
        System.out.println("");
        System.out.println("Enter '@' all div ans or '%' for single div ans ");
        char input = sc.next().charAt(0);
        
        if (input == '/' ) {
            continue;
        }

        if (input == '%' ) {

            System.out.println("");
            System.out.println("Your input is:" + divarray);
            System.out.println("");
            System.out.println("Plz enter the quotient");
            double quotient = sc.nextInt();
            quotientarray.add(quotient);
            k = 1;
            singledivans();
        }

        if (input == '*') {
            mularray();
        }

        if (input == '+') {
            addarray();
        }

        if (input == '-') {
            subarray();
        }

        if (input == '&' ) {
            addsubarray();
        }

        if (input == '=') {
            fullans();
        }
        
        if (input == '@') {
            System.out.println("");
            System.out.println("Your input is:" + divarray);
            System.out.println("");
            System.out.println("Plz enter the quotient");
            double quotient = sc.nextInt();
            quotientarray.add(quotient);
            
            k = 1;
            alldivans();
        }

        if (input == '~') {
            main(null);
        }

        if (input == '_') {
             System.exit(0);
        }

        if (input == '!') {
          info();
        }
    }
    }
    
    public static void singledivans() {
        double j = 0;
        for (int i = 0; i < divarray.size(); i++) {
            j = j + divarray.get(i);
        }
        double singledivans = j/quotientarray.get(0);
        divansarray.add(singledivans);
        System.out.println(singledivans);
        divarray.clear();
        quotientarray.clear();

        input();
    }
    
    public static void alldivans() {

        double j = 0;
        for (int i = 0; i < divarray.size(); i++) {
            j = j + divarray.get(i);
        }
        double singledivans = j/quotientarray.get(0);
        divansarray.add(singledivans);
        System.out.println(singledivans);
        divarray.clear();
        quotientarray.clear();

        double k = 0 ;
        for (int i = 0; i < divansarray.size(); i++) {
            k = k + divansarray.get(i);
            finaldivansarray.add(k);
           
        }
        System.out.println("");
        System.out.println("Here is the total of all your ans");
        
        System.out.println(k);

        input();
    }

    public static void addarray() {
        System.out.println("Addition part:-");
        System.out.println("plz enter the no and then this '+' sign to continue adding no for addition or enter any other sign to shift on that calculation eg '*' '-' '/' ");
        

        int k = 1;

        System.out.println("Enter '+0' to stop entering numbers");
        for (int j = 0; j < 1; j=j+0) {

        for (int i = 0; i < 1; i=i+0) {
            System.out.println("Enter the "+ k +" Value");
            double no1 = sc.nextInt();
            addarray.add(no1);

            if(no1 == +0){
                break;
            }

            k++;

            }

            System.out.println("Enter the sign ");
            System.out.print("# ");
            System.out.println("Enter @ for ans:");
            char input = sc.next().charAt(0);
            
            if (input == '+' ) {
                continue;
            }

            if (input == '/') {
                divarray();
            }

            if (input == '*') {
                mularray();
            }

            if (input == '-') {
                subarray();
            }

            if (input == '&' ) {
                addsubarray();
            }
            
            if (input == '=') {
                fullans();
            }

            if (input == '@') {
                k=0;
                addans();
            }

            if (input == '~') {
                main(null);
            }

            if (input == '_') {
                 System.exit(0);
            }

            if (input == '!') {
              info();
            }
        } 
    }
    
    public static void addans() {
        double k = 0;
        for (int i = 0; i < addarray.size(); i++) {
            k = k + addarray.get(i);
         
        }
        addansarray.add(k);
        addarray.clear();
        System.out.println(k);

        input();
    }
    
    public static void subarray() {
        System.out.println("Same Subtraction part:-");
        System.out.println("plz enter the no and then this '-' sign to continue adding no for sub or enter any other sign to shift on that calculation eg '+' '*' '/' ");
        

        int k = 1;

        for (int j = 0; j < 1; j=j+0) {

        for (int i = 0; i < 1; i=i+0) {
            System.out.println("Enter the "+ k +" Value");
            double no1 = sc.nextInt();
            subarray.add(no1);

            if(no1 == +0){
                break;
            }

            k++;

            }

            System.out.println("Enter the sign ");
            System.out.print("# ");
            System.out.println("Enter @ for ans:");
            char input = sc.next().charAt(0);
            k++;
            if (input == '-' ) {
                continue;
            }

            if (input == '/') {
                divarray();
            }

            if (input == '*') {
                mularray();
            }

            if (input == '+') {
                addarray();
            }

            if (input == '=') {
                fullans();
            }

            if (input == '&' ) {
                addsubarray();
            }
            
            if (input == '@') {
                k=0;
                subans();
            }

            if (input == '~') {
                main(null);
            }

            if (input == '_') {
                 System.exit(0);
            }

            if (input == '!') {
              info();
            }
        } 
    }

    public static void subans() {
        double k = 0;
        for (int i = 0; i < subarray.size(); i++) {
            k = k - subarray.get(i);
         
        }
        subansarray.add(k);
        subarray.clear();
        System.out.println(k);

        input();
    }

    public static void addsubarray() {
        System.out.println("Addition-Subtraction part:-");
        System.out.println("plz enter the no and then this '-' sign to continue adding no for sub and '+' sign to continue add no's for adding \n Or enter any other sign to shift on that calculation eg '+' '*' '/' ");
                        
            int k = 1;

            System.out.println("");
            System.out.println("Here you will enter no's");
            System.out.println("You have to enter no with signs '+' '-' before them");
            System.out.println("Do not enter any sign alone");
            System.out.println("Enter '+0' to stop entering numbers");
    
            for (int i = 0; i < 1; i=i+0) {
                
                System.out.println("");
                System.out.println("Enter the "+ k +" Value");
                double no1 = sc.nextInt();
                addsubarray.add(no1);

                if(no1 == +0){
                    break;
                }
                k++;
            }
            System.out.println("Enter the sign ");
            System.out.print("# ");
            System.out.println("Enter @ for ans:");
            char input = sc.next().charAt(0);
            
            if (input == '-' ) {
                subarray();
            }

            if (input == '/') {
                divarray();
            }

            if (input == '*') {
                mularray();
            }

            if (input == '+') {
                addarray();
            }

            if (input == '=') {
                fullans();
            }

            if (input == '@') {
                k=0;
                addsubans();
            }

            if (input == '~') {
                main(null);
            }

            if (input == '_') {
                 System.exit(0);
            }

            if (input == '!') {
              info();
            
        } 
    }
    

    public static void addsubans() {
        double k = 0;
        for (int i = 0; i < addsubarray.size(); i++) {
            k = k + addsubarray.get(i);
        }
        addsubansarray.add(k);
        System.out.println(k);
        addsubarray.clear();

        input();
    }

    public static void fullans() {
        System.out.println("");
        System.out.println("Here's the answers of all calculation done by you");
        System.out.println("");
        if (addansarray.size()>0) {
            System.out.println("Ans of addition");
            System.out.println(addansarray);
        }
        System.out.println("");
        if (subansarray.size()>0) {
            System.out.println("Ans of subtraction");
            System.out.println(subansarray);
            }
        System.out.println("");
        if (addansarray.size()>0) {
            System.out.println("Ans of division");
            System.out.println(divansarray);
            }
        System.out.println("");
        if (addansarray.size()>0) {
            System.out.println("Ans of multiplication");
            System.out.println(mulansarray);
            }
        System.out.println("");
        if (addansarray.size()>0) {
            System.out.println("Ans of addition and subtraction");
            System.out.println(addsubansarray);
            }
        System.out.println("");
        System.out.println(addansarray.get(0) + subansarray.get(0) +divansarray.get(0) + mulansarray.get(0) + addsubansarray.get(0));
        

        input();

    }

    public static void main(String[] args) {
        
       /* int k = 0;

        for (int i = 0; i < 1; i=i+0) {
            int no1 = sc.nextInt();
            k = k + no1;
            char input = sc.next().charAt(0);
            if (input == '+' ) {
                
            }
            else{
                break;
            }
        }
        System.out.println(k);
        System.out.println("Thankyou");

        sc.close();*/
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("This program will help you to calculate numbers if you are not Spock.");
        System.out.println("By the way this follow BODMAS.");
        System.out.println("Fill the numbers as directed.");

        System.out.println("");
        System.out.println("Here the some shortcut keys and instructions:-");
        System.out.println("");
        System.out.println("1) To change the type of calculation enter any sign in the sign place");
        System.out.println("2) To get the reasult of full equation enter '=' sign");
        System.out.println("2) To get the reasult of the single equation enter '@' sign");
        System.out.println("3) To restart the program enter '~' sign ");
        System.out.println("4) To quit the program enter '_' sign");
        System.out.println("5) To know about us enter '!' sign");
        System.out.println("");
        System.out.println("6)To display this instruction manual enter '?' ");
        System.out.println("");
        System.out.println("NOTE:- /n These shortcut will be applicable at the place where the input follows '#' sign ");

        System.out.println("Plz enter the sign which will process the data eg:'+' '-' '*' '/' '&' ");
        System.out.println("");
        System.out.println("+ for addition no's");
        System.out.println("- for subtraction no's");
        System.out.println("* for multiplication no's");
        System.out.println("/ for division no's");
        System.out.println("& for addition and subtraction no's");
        System.out.println("");
        System.out.println("Enter '^' for more options");
        System.out.println("");
        System.out.println("Enter '>' to quit entering signs");
        System.out.println("");

        for (int i = 0; i < 1; i=i+0) {
                
            System.out.println("");
            System.out.println("Enter the Sign");
            System.out.println("#");
    
            char caltype = sc.next().charAt(0);

            if(caltype == '>'){
                break;
            }
         
            if (caltype == '*' ) {
                mularray();
            }

            if (caltype == '/' ) {
                divarray();
            }

            if (caltype == '+' ) {
                addarray();
            }
 
            if (caltype == '-' ) {
                subarray();
            }
 
            if (caltype == '&' ) {
                addsubarray();
            }

            if (caltype == '^' ) {
                input();
            }
        }
        System.out.println("");   
        System.out.println("Thanks for giving us a chance to serve you");   
        System.out.println("");   
        System.out.println("Have a good day sir");  
        System.out.println(""); 
    }
}    