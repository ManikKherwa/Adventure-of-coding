public class eg {
    int k = 55;
    public char[] y;
    static int sum(int k){
        if (k>0) {
            return k + sum(k-1);
        } 
        else {
            return 0;
        } }
              //reciurtion2
              public static int sum(int end , int start){
                if (end>start) {
                   return end + sum(end-1,start);
                } 
                else {
                   return end;
                }
             }
    public  void myme(){
        System.out.println("hi iam manikkherwa");
    }

public static void main(String[] args) {
   cou myobj1 = new cou();
   System.out.println(myobj1.getName());
   myobj1.setName("oolalaoolala");
   System.out.println(myobj1.getName());
    int reasult = sum(10);
    System.out.println(reasult);
    int reasult2 = sum(15,5);
    System.out.println(reasult2);
}

}
