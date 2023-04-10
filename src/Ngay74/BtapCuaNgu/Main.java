package Ngay74.BtapCuaNgu;

import java.util.Scanner;

public class Main {
    static Scanner scanner=new Scanner(System.in);
    public static void main(String[] args) {
        FullTime nv1=new FullTime(1,"NV1",18,10);
        FullTime nv2=new FullTime(1,"NV2",18,3);
        FullTime nv3=new FullTime(1,"NV3",18,5);
        PartTime pv1=new PartTime(1,"PV1",15,2);
        PartTime pv2=new PartTime(1,"PV2",15,2);
        Employee[] employees={nv1,nv2,nv3,pv1,pv2};
        int choice;

      do{
          System.out.println("MENU:");
          System.out.println("1.Hien Thi nhan vien:");
          System.out.println("2.Them nhan vien moi:");
          System.out.println("3.Xoa nhan vien moi:");
          choice=Integer.parseInt(scanner.nextLine());
          switch (choice){
              case 1:
                  display(employees);
                  break;
              case 2:
                  add(employees);
                  break;
              case 3:
                  display(employees);
                  delete(scanner,employees);
                  break;
              case 0:
                  System.exit(0);
          }
      }while (choice!=0);

    }
//    public static int luonFullTime(FullTime a){
//        return a.getYearOfExp()*2000000;
//    }
//    public static int luonPartTime(PartTime b){
//        return b.getWordTime()*25000;
//    }
    public static void display(Employee[] employees){
        System.out.println("Danh sach nhan vien FullTime:");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof FullTime){
                System.out.println((FullTime)employees[i]);
            }
        }
        System.out.println("Danh sach nhan vien PartTime:");
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof PartTime){
                System.out.println((PartTime)employees[i]);
            }
        }
    }
    public static void delete(Scanner scanner ,Employee[] employees){
        System.out.println("Nhap ten doi tuong can xoa:");
        String name=scanner.nextLine();
        Employee[] deleteProduct=new Employee[employees.length-1];
        boolean check=true;
        int index=0;
        for (Employee p:employees) {
            if(!p.getName().equals(name)){
                deleteProduct[index]=p;
                index++;
                check=false;
            }
        }if(check){
            System.out.println("Khong tim thay doi tuong.");
            display(employees);
        }else {
            display(deleteProduct);
        }

    }
    public static void add(Employee[] employees){
        System.out.println("1.Neu ban muon them FullTime");
        System.out.println("2.Neu ban muon them PartTime");
        int number=scanner.nextInt();
        Employee[] employees1=new Employee[employees.length+1];
        FullTime newFulltime=new FullTime();
        PartTime newParttime=new PartTime();
        if(number==1){
            System.out.println("Nhap ID cho nhan vien");
            newFulltime.setId(scanner.nextInt());
            System.out.println("Nhap name cho nhan vien");
            newFulltime.setName(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Nhap age cho nhan vien");
            newFulltime.setAge(scanner.nextInt());
            System.out.println("Nhap year cho nhan vien");
            newFulltime.setYearOfExp(scanner.nextInt());
            for (int i = 0; i < employees.length; i++) {
                employees1[i]=employees[i];
            }
            employees1[employees.length]=newFulltime;
            display(employees1);
        }if(number==2){
            System.out.println("Nhap ID cho nhan vien");
            newParttime.setId(scanner.nextInt());
            System.out.println("Nhap name cho nhan vien");
            newParttime.setName(scanner.nextLine());
            scanner.nextLine();
            System.out.println("Nhap age cho nhan vien");
            newParttime.setAge(scanner.nextInt());
            System.out.println("Nhap year cho nhan vien");
            newParttime.setWordTime(scanner.nextInt());
            for (int i = 0; i < employees.length; i++) {
                employees1[i]=employees[i];
            }employees1[employees.length]=newParttime;
            display(employees1);
        }
    }

}
