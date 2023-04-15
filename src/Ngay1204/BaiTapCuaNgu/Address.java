package Ngay1204.BaiTapCuaNgu;

public class Address {
    private String name;
    private int id;
    static int idUp=1;

    public Address() {
        this.id=idUp++;
    }

    public Address(String name) {
        this.name = name;
        this.id = idUp++;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", id=" + id ;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
