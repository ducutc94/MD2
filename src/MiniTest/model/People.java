package MiniTest.model;

public class People {
    private String name;
    public static int idUp=1;
    private String age;
    private int id;

    public People(String name, String age) {
        this.id=idUp++;
        this.name = name;
        this.age = age;
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

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return
                "id=" + id +
                "----name=" + name  +
                " ----age=" + age  ;
    }
}
