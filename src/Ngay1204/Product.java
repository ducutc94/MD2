package Ngay1204;

public class Product {
     static int idUp=1;
    private int id;
    private String name;
    private String type;
    Brand brand;
    public Product(){
     this.id=idUp++;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", brand=" + brand.getName() +
                '}';
    }

    public Product(String name, String type, Brand brand) {
        this.id =idUp++ ;
        this.name = name;
        this.type = type;
        this.brand = brand;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }
}
