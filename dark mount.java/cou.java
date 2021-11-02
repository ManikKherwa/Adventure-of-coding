public class cou {
    int age  ;
    String fname , lname, dob ;
    public cou(int age2 , String dob3 , String fname4 , String lname5 ){
        age=age2;
        dob=dob3;
       fname= fname4 ; 
       lname=lname5 ;
    }
    public cou() {
    }
    private String name = "mainikkherwa";
    public String getName(){
        return name;
    }
    public void setName(String newName){
        name=newName;
    }
    public static void main(String[] args) {
        cou myobj = new cou(13 ,"is my age and 13 agu 2007 is my dob" , " my name is manik" ,"kherwa");
        eg myobj2 = new eg();
        myobj2.myme();
        System.out.println(myobj.age+myobj.dob+myobj.fname+myobj.lname);
    }
}
