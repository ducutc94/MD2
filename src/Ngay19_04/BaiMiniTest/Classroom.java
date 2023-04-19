package Ngay19_04.BaiMiniTest;

public class Classroom {
    private int id;
    private String name;
    private  static  int INDEX=0;

    public Classroom( String name) {
        this.id = ++INDEX;
        this.name = name;
    }

    public Classroom() {

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

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
