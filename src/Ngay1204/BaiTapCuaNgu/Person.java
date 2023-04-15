package Ngay1204.BaiTapCuaNgu;

public class Person implements Comparable<Person> {
    private int id;
    private String name;
    private int age;
    private Address address;
    static int idUp=1;

    public Person() {
        this.id=idUp++;
    }

    public Person( String name, int age, Address address) {
        this.id = idUp++;
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge(int i) {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Address getAddress(Address p) {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "["+
                "id:  " + id +
                ", name:  '" + name + '\'' +
                ", age:  " + age +
                ", address: " + address.getName() +"]";
    }

    @Override
    public int compareTo(Person o) {
        return this.name.compareTo(o.getName());
    }
}
