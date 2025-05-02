public class firstClass {
    //primitive data types
    int age = 17;
//    byte amount = 90;
//    short salary = 10;
//    long height= 45;


    //access modifier
    public static String names ="Goddy";

    //classwork

    //access modifier 1
    public String playing(){
        return "Romziya is playing in/under the rain";
    }

    //access modifier 2
    public static String run(){
        return "Godwin is the fastest footballer";
    }

    //access modifier 3
    private static String jump(){
        return "Godwin can jump really high";
    }

    //access modifier 4
    private String pass(){
        return "Godwin is one of the best passer on the planet";
    }

    //access modifier
    protected String dribble(){
        return "Godwin is easily among the top 5 dribblers in history of football";
    }
     public static void main(String[] args) {

        //access method
         firstClass firstClass = new firstClass();

         String name = "Dammy";
         System.out.println(name+" is going to YabaTech");
         System.out.println("Shiii's working");
         System.out.println(names);

         //printing out methods
         System.out.println(firstClass.pass());
         System.out.println(jump());
         System.out.println(firstClass.dribble());
    }
}
