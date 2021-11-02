import java.util.Scanner;
import java.util.ArrayList;

public class ex3 {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Double> expressionarray = new ArrayList<Double>();
    static ArrayList<Double> allexpressionarrayans = new ArrayList<Double>();

    static ArrayList<Character> characterarray = new ArrayList<Character>();
    static ArrayList<Integer> intarrangerarray = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i=i+0) {
        String str1 = sc.nextLine();
        String str2 = str1;
        
        intfinder(str1);
        charfinder(str2);
        mulprocessor();
        }

        sc.close();
    }

    public static void intfinder(String str1) {
        str1 = str1.replaceAll("[^\\d]", " ");
        System.out.println(str1);

        str1 = str1.trim();
        System.out.println(str1);

        str1 = str1.replaceAll(" +" , " ");
        System.out.println(str1);
        intarranger(str1);
    }

    public static void intarranger(String str1) {
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != ' ') {
                intarrangerarray.add(Character.getNumericValue(str1.charAt(i)));
                continue;
            }
                intadder();
                intarrangerarray.clear();
        }
            intadder();
            intarrangerarray.clear();
        System.out.println(intarrangerarray);
        System.out.println(expressionarray);
    }

    public static void intadder() {
        Double j = 0.0;
        int h = 0;
        for (int i = intarrangerarray.size() - 1; i >= 0 ; i--) {
            j= j + (intarrangerarray.get(i)*Math.pow(10,h ));
            h++;
        }
        expressionarray.add(j);
    }

    public static void charfinder(String str2) {
        for (int i = 0; i < str2.length(); i++) {
            
            if (str2.charAt(i) == 43 || str2.charAt(i) == 45 || str2.charAt(i) == 42 || str2.charAt(i) == 47) {
                characterarray.add(str2.charAt(i));
            }
        }
        System.out.println(characterarray);
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
        allexpressionarrayans.add(expressionarray.get(0));
        expressionarray.clear();
    }
    
}
