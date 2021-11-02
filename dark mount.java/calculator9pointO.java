import java.util.Scanner;
import java.util.ArrayList;

public class calculator9pointO {

    static Scanner sc = new Scanner(System.in);
    
    static ArrayList<Double> expressionarray = new ArrayList<Double>();
    static ArrayList<Double> expressionarray1 = new ArrayList<Double>();
    static ArrayList<Double> expressionarray2 = new ArrayList<Double>();
    static ArrayList<Double> allexpressionarrayans = new ArrayList<Double>();

    static ArrayList<Character> characterarray = new ArrayList<Character>();
    static ArrayList<Character> characterarray2 = new ArrayList<Character>();
    static ArrayList<Integer> intarrangerarray = new ArrayList<Integer>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 1; i=i+0) {
        String str1 = sc.nextLine();
        String str2 = str1;
        
        intfinder(str1);
        charfinder(str2);
        brackets();
        divprocessor();
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
        System.out.println(expressionarray1);
    }

    public static void intadder() {
        Double j = 0.0;
        int h = 0;
        for (int i = intarrangerarray.size() - 1; i >= 0 ; i--) {
            j= j + (intarrangerarray.get(i)*Math.pow(10,h ));
            h++;
        }
        expressionarray1.add(j);
    }

    public static void charfinder(String str2) {
        for (int i = 0; i < str2.length(); i++) {
            
            if (str2.charAt(i) == 43 || str2.charAt(i) == 45 || str2.charAt(i) == 42 || str2.charAt(i) == 47 || str2.charAt(i) == 40 || str2.charAt(i) == 41) {
                characterarray.add(str2.charAt(i));
            }
        }
        System.out.println(characterarray);
    }

    public static void brackets() {
        System.out.println("brackets");
        for (int i = 0; i < characterarray.size(); i++) {        
            if (characterarray.get(i) == '(') {        
                for (int j = i+1; j < characterarray.size(); j++) {        
                    if (characterarray.get(j) != ')') {       
                    characterarray2.add(characterarray.get(j));
                    characterarray.remove(j);
                    System.out.println(characterarray2);
                    System.out.println(characterarray);
                        expressionarray2.add(expressionarray1.get(j-1));
                        expressionarray1.remove(j-1);
                        --j;
                    }
                    if (characterarray.get(j) == ')') {
                        characterarray.remove(j);
                        expressionarray2.add(expressionarray1.get(j-1));
                        expressionarray1.remove(j-1);
                        expressionarray = expressionarray2;
                        divprocessor2();
                        System.out.println(expressionarray1);
                        expressionarray1.add(j-1, expressionarray2.get(0));
                        System.out.println(expressionarray1);
                        expressionarray2.clear();
                        break;

                    }

                }
                characterarray.remove(i);
                System.out.println(characterarray);
            }
        }

        System.out.println(expressionarray2);
        System.out.println(characterarray2);
        //divprocessor();
        System.out.println(expressionarray1);
        System.out.println(characterarray);
        //divprocessor();
    }

       public static void divprocessor() {
        
        for (int i = 0; i < characterarray.size(); i++) {
            if (characterarray.get(i) == '/') {
                System.out.println(expressionarray1.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray1.get(i+1));
                Double k =expressionarray1.get(i) / expressionarray1.get(i+1);
                expressionarray1.set(i+1, k);
                System.out.println(expressionarray1);
                expressionarray1.remove(i);
                System.out.println(expressionarray1);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray1);
        System.out.println(characterarray);
        mulprocessor();
    }

    public static void mulprocessor() {
        
        for (int i = 0; i < characterarray.size(); i++) {
            if (characterarray.get(i) == '*') {
                System.out.println(expressionarray1.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray1.get(i+1));
                Double k =expressionarray1.get(i) * expressionarray1.get(i+1);
                expressionarray1.set(i+1, k);
                System.out.println(expressionarray1);
                expressionarray1.remove(i);
                System.out.println(expressionarray1);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray1);
        System.out.println(characterarray);
        addprocessor();
    }

    public static void addprocessor() {
        for (int i = 0; i < characterarray.size(); ++i) {
            if (characterarray.get(i) == '+') {
                System.out.println(expressionarray1.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray1.get(i+1));
                Double k =expressionarray1.get(i) + expressionarray1.get(i+1);
                expressionarray1.set(i+1, k);
                System.out.println(expressionarray1);
                expressionarray1.remove(i);
                System.out.println(expressionarray1);
                System.out.println(characterarray);
                characterarray.remove(i);
                System.out.println(characterarray);
                i--;
            }
        }
        System.out.println(expressionarray1);
        System.out.println(characterarray);
        subprocessor();
    }

    public static void subprocessor() {
        for (int i = 0; i < characterarray.size(); ++i) {
            if (characterarray.get(i) == '-') {
                System.out.println(expressionarray1.get(i));
                System.out.println(characterarray.get(i));
                System.out.println(expressionarray1.get(i+1));
                Double k =expressionarray1.get(i) - expressionarray1.get(i+1);
                expressionarray1.set(i+1, k);
                System.out.println(expressionarray1);
                expressionarray1.remove(i);
                System.out.println(expressionarray1);
                characterarray.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray1);
        System.out.println(characterarray);
        finalans();
    }

    public static void divprocessor2() {
        
        for (int i = 0; i < characterarray2.size(); i++) {
            if (characterarray2.get(i) == '/') {
                System.out.println(expressionarray2.get(i));
                System.out.println(characterarray2.get(i));
                System.out.println(expressionarray2.get(i+1));
                Double k =expressionarray2.get(i) / expressionarray2.get(i+1);
                expressionarray2.set(i+1, k);
                System.out.println(expressionarray2);
                expressionarray2.remove(i);
                System.out.println(expressionarray2);
                characterarray2.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray2);
        System.out.println(characterarray2);
        mulprocessor2();
    }

    public static void mulprocessor2() {
        
        for (int i = 0; i < characterarray2.size(); i++) {
            if (characterarray2.get(i) == '*') {
                System.out.println(expressionarray2.get(i));
                System.out.println(characterarray2.get(i));
                System.out.println(expressionarray2.get(i+1));
                Double k =expressionarray2.get(i) * expressionarray2.get(i+1);
                expressionarray2.set(i+1, k);
                System.out.println(expressionarray2);
                expressionarray2.remove(i);
                System.out.println(expressionarray2);
                characterarray2.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray2);
        System.out.println(characterarray2);
        addprocessor2();
    }

    public static void addprocessor2() {
        
        for (int i = 0; i < characterarray2.size(); i++) {
            if (characterarray2.get(i) == '+') {
                System.out.println(expressionarray2.get(i));
                System.out.println(characterarray2.get(i));
                System.out.println(expressionarray2.get(i+1));
                Double k =expressionarray2.get(i) + expressionarray2.get(i+1);
                expressionarray2.set(i+1, k);
                System.out.println(expressionarray2);
                expressionarray2.remove(i);
                System.out.println(expressionarray2);
                characterarray2.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray2);
        System.out.println(characterarray2);
        subprocessor2();
    }

    public static void subprocessor2() {
        
        for (int i = 0; i < characterarray2.size(); i++) {
            if (characterarray2.get(i) == '-') {
                System.out.println(expressionarray2.get(i));
                System.out.println(characterarray2.get(i));
                System.out.println(expressionarray2.get(i+1));
                Double k =expressionarray2.get(i) - expressionarray2.get(i+1);
                expressionarray2.set(i+1, k);
                System.out.println(expressionarray2);
                expressionarray2.remove(i);
                System.out.println(expressionarray2);
                characterarray2.remove(i);
                i--;
            }
        }
        System.out.println(expressionarray2);
        System.out.println(characterarray2);
        finalans2();
    }

    public static void finalans2() {

        System.out.println(expressionarray2);
        System.out.println(expressionarray2.get(0));
        
    }

    public static void finalans() {

        System.out.println(expressionarray1);
        System.out.println(expressionarray1.get(0));
        allexpressionarrayans.add(expressionarray1.get(0));
        expressionarray1.clear();
    }
    
}