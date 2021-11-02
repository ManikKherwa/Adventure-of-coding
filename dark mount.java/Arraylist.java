import java.util.ArrayList;
import java.util.Collections;
public class Arraylist {
    public static void main(String[] args) {

        ArrayList<String> mycars = new ArrayList<String>();
        mycars.add("Honda Amaze");
        mycars.add("Bolero Camper");
        mycars.add("Enova");   
        mycars.add("Baleno");   
        mycars.add("Swift");   
        System.out.println(mycars);  
        System.out.println( mycars.get(1)); 
        mycars.set(3,"Scorpio");   
        System.out.println(mycars); 
        mycars.remove(4);
        System.out.println(mycars);
        System.out.println( mycars.size());
        for (int i = 0; i < mycars.size(); i++) {
            System.out.println(mycars.get(i));
        }
        for (String i : mycars) {
            System.out.println(i);
        }

        ArrayList<Integer> mynum = new ArrayList<Integer>();
        mynum.add(44);
        mynum.add(46);
        mynum.add(2);
        mynum.add(65);
        mynum.add(26);
        for (Integer i : mynum) {
            System.out.println(i);
        }
        Collections.sort(mycars);
        for (String i : mycars) {
            System.out.println(i);
        }
        Collections.sort(mynum);
        for (Integer i : mynum) {
            System.out.println(i);
        }
        mycars.clear();
        System.out.println(mycars);
    }
}
