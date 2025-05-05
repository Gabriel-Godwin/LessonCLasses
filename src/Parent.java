//Encapsulation CLASS 1


public class Parent {
    private String name;
    private String address;
    private int age;
    private String phoneNumber;

    //no args Constructor
    public Parent(){

}

    @Override
    public String toString() {
        return "Parent{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", phoneNumber='" + phoneNumber + '\'' +
                '}';
    }

    public static void main(String[] args) {
        //Instance of Class
        Parent parent = new Parent();

        parent.name = "Mr Debo Adeniran Ogunsayan";
        parent.address = "Akerele,Shitta,Lagos";
        parent.age = 62;
        parent.phoneNumber = "08093756283";
        System.out.println(parent);
    }


    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }





      //All args Constructor
    public Parent(String name, String address, int age, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.age = age;
        this.phoneNumber = phoneNumber;

        //Displaying All args Constructor objects
        Parent parent1 = new Parent("Ismail Awal", "surulere", 2, "09068395728");
    }
}
