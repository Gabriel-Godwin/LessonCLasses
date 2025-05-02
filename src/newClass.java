
//A class is a blueprint of an object
public class newClass {

    public void add(int a,int b){
       int add = a+b;
    }
    String className;
    String schoolName;

    @Override
    public String toString() {
        return "newClass{" +
                "className='" + className + '\'' +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    //no args constructor
    public newClass(){

    }

    //all args constructor
    public newClass(String className, String schoolName){
        this.className = className;
        this.schoolName = schoolName;
    }

    public static void main(String[] args) {
       //OBJECT IS AN INSTANCE OF A CLASS
        newClass getObjects = new newClass();
       getObjects.add(3,4);
       getObjects.className = "Final Year";
       getObjects.schoolName = "MiddleSex University";

        System.out.println(getObjects);
    }
}

//types of constructors
//1.all args
//2. no args
