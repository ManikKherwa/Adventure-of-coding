import java.util.Scanner;
import java.util.ArrayList;


public class ex2 {
    static ArrayList<Character> chararray = new ArrayList<Character>();
    static ArrayList<Integer> intarrangerarray = new ArrayList<Integer>();
    static ArrayList<Double> intarray = new ArrayList<Double>();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = str1;
        
        intfinder(str1);
        charfinder(str2);

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
        System.out.println(intarray);
    }

    public static void intadder() {
        Double j = 0.0;
        int h = 0;
        for (int i = intarrangerarray.size() - 1; i >= 0 ; i--) {
            j= j + (intarrangerarray.get(i)*Math.pow(10,h ));
            h++;
        }
        intarray.add(j);
    }

    public static void charfinder(String str2) {
        for (int i = 0; i < str2.length(); i++) {
            
            if (str2.charAt(i) == 43 || str2.charAt(i) == 45 || str2.charAt(i) == 42 || str2.charAt(i) == 47) {
                chararray.add(str2.charAt(i));
            }
        }
        System.out.println(chararray);
    }

}
