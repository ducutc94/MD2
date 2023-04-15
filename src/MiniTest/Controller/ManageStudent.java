package MiniTest.Controller;

import MiniTest.model.People;
import MiniTest.model.Students;

import java.util.ArrayList;
import java.util.Scanner;

public class ManageStudent implements Manage {
      ArrayList <People> people=new ArrayList<>();
    private final Scanner scanner;

    public ManageStudent() {
        scanner=new Scanner(System.in);
        people.add(new People("Nam","18"));
        people.add(new Students("Bắc","20",20.5));
    }

    @Override
    public void display() {
        for (People person : people) {
            System.out.println(person);
        }
    }

    @Override
    public void addPeople() {
            System.out.println("Nhập tên :");
            String name=scanner.nextLine();
            System.out.println("Nhập tuổi :");
            String age=scanner.nextLine();
            People people1=new People(name,age);
            people.add(people1);

    }
    @Override
    public void addStudent(){
        System.out.println("Nhập tên :");
        String name=scanner.nextLine();
        System.out.println("Nhập tuổi :");
        String age=scanner.nextLine();
        System.out.println("Nhập điểm TB:");
        double averagePoint=scanner.nextInt();
        scanner.nextLine();
        People students= new Students(name,age,averagePoint);
        people.add(students);
    }

    @Override
    public void searchPeople() {
        System.out.println("Nhập tên muốn tìm kiếm");
        String name=scanner.nextLine();
        boolean flag=true;
        for (People person : people) {
            if (person.getName().contains(name)) {
                System.out.println(person);
                flag = false;
            }
        }
        if(flag){
            System.out.println("Không tìm thấy");
        }
    }

    @Override
    public void deletePeople() {
        System.out.println("Nhập id muốn xóa");
        int id = scanner.nextInt();
        int idDelete = getIndexById(id);
        if (idDelete != -1) {
            people.remove(idDelete);
            System.out.println("Xóa thành công");
        } else {
            System.out.println("Không có id cần xóa");
        }
    }
    @Override
    public void editById() {
        System.out.println("Nhập id cần sửa");
        int id=Integer.parseInt(scanner.nextLine());
        int indexEdit=getIndexById(id);
        if(people.get(indexEdit) instanceof Students){
            System.out.println("Nhập tên mới:");
            people.get(indexEdit).setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới:");
            people.get(indexEdit).setAge(scanner.nextLine());
            System.out.println("Nhập điểm TB mới:");
            ((Students) people.get(indexEdit)).setAveragePoint(Integer.parseInt(scanner.nextLine()));
        }else {
            System.out.println("Nhập tên mới:");
            people.get(indexEdit).setName(scanner.nextLine());
            System.out.println("Nhập tuổi mới:");
            people.get(indexEdit).setAge(scanner.nextLine());
        }
        System.out.println("Bạn đã sửa thành công");
    }

    @Override
    public void compareToAveragePoint() {
        people.sort((o1, o2) -> {
            if(o1 instanceof Students&& o2 instanceof Students){
                return (int) ((Students) o1).getAveragePoint()-(int)((Students) o2).getAveragePoint();
            }
            return 0;
        });
        display();
    }
    @Override
    public void total() {
double total=0;
        for (People person : people) {
            if (person instanceof Students) {
                total += ((Students) person).getAveragePoint();
            }
        }
        System.out.println("Tổng là: " +total);
    }
    @Override
    public int getIndexById(int id){
        for (int i = 0; i < people.size(); i++) {
            if(id==people.get(i).getId()){
                return  i;
            }
        }return -1;
    }
}
