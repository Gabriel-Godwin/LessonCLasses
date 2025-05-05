public class Student {

    //no args Constructor
    public Student(){

    }

    String name;
    int age;
    String className;
    String address;
    int position;
    String schoolName;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", className='" + className + '\'' +
                ", address='" + address + '\'' +
                ", position=" + position +
                ", schoolName='" + schoolName + '\'' +
                '}';
    }

    //all args constructor
//    public Student(String name, int age, String className, String address, int position, String schoolName) {
//        this.name = name;
//        this.age = age;
//        this.className = className;
//        this.address = address;
//        this.position = position;
//        this.schoolName = schoolName;
//    }

    public static void main(String[] args) {

        //instance of class
        //setting and displaying objects of the used constructor(no args) using instance of the class
        Student student = new Student();
        student.address = "Ikeja";
        student.age = 19;
        student.className = "SS3";
        student.name = "Gatuso Pellegrini";
        student.position = 4;
        student.schoolName = "Maverick College";
        System.out.println(student);

        //instance of class
        //setting and displaying objects of the used constructor(no args) using instance of the class
//        Student student1 = new Student("name","address","blah blah....");


    }
}
