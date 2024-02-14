public class Customer {
    String name;
    int age;
    String address;


    Customer (String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;

    }
    public String toString() {
        return "Name: " + name + ", Age: " + age + ", Address: " + address;
    }


    public String getName () {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress(){
        return address;
    }

    //setters

    public void setName(String newName) {
        this.name = newName;
    }

    public void setAge(int newAge){
        this.age = newAge;
    }

    public void setAddress(String newAdress) {
        this.address = newAdress;
    }
}
