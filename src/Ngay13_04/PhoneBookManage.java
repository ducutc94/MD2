package Ngay13_04;

import java.util.Arrays;
import java.util.Scanner;

public class PhoneBookManage extends Phone implements Iphone {
    Contact[] phoneList;
    private final Scanner scanner;

    public PhoneBookManage() {
        scanner = new Scanner(System.in);
        phoneList = new Contact[10];
        // Đ 10 phần tử thì Arays.sort() k hiện thị đc vì có phần tử =null.
        Contact contact = new Contact("Duc", "09888888");
        Contact contact1 = new Contact("CodeGym", "09888888");
        Contact contact2 = new Contact("An", "0988854353888");
        phoneList[0] = contact;
        phoneList[1] = contact1;
        phoneList[2] = contact2;
    }

    @Override
    void insertPhone() {
        Contact contact;
        contact = createContact();
        int index = 0;
        for (Contact contact1 : phoneList) {
            if (contact1 != null) {
                index++;
            }
        }
        phoneList[index] = contact;
    }

    @Override
    void updatePhone() {
        System.out.println("Nhập tên bạn muốn sửa:");
        String name = scanner.nextLine();
        int indexUpdate = getIDbyName(name);
        if (indexUpdate != -1) {
            System.out.println("Nhập tên mới");
            String newName = scanner.nextLine();
            if (!newName.equals("")) {
                phoneList[indexUpdate].setName(newName);
            }
            System.out.println("Nhập số mới ");
            String newPhone = scanner.nextLine();
            if (!newPhone.equals("")) {
                phoneList[indexUpdate].setPhoneNumber(newPhone);
            }
        } else {
            System.out.println("Không có tên trong danh sách");
        }
    }

    void display() {
        for (Contact p : phoneList) {
            System.out.println(p);
        }

    }

    public Contact createContact() {
        System.out.println("Mời Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Mời nhập số điện thoại:");
        String phone = scanner.nextLine();
        return new Contact(name, phone);
    }


    @Override
    void removePhone() {
        System.out.println("Nhập tên bạn muốn xóa:");
        String name = scanner.nextLine();
        int indexDelete = getIDbyName(name);
        Contact[] contactsDelete = new Contact[phoneList.length - 1];
        if (indexDelete != -1) {
            System.arraycopy(phoneList, 0, contactsDelete, 0, indexDelete);
            System.arraycopy(phoneList, indexDelete + 1, contactsDelete, indexDelete, phoneList.length - indexDelete - 1);
            phoneList = contactsDelete;
            System.out.println("Xóa Thành công");
        } else {
            System.out.println("Không tồn tại tên cần xóa");
        }

    }

    public int getIDbyName(String name) {
        for (int i = 0; i < phoneList.length; i++) {
            //Vì mảng có null nên phần từ null.getName() trả giá trị null==> lỗi
            if (phoneList[i] != null) {
                if (name.equals(phoneList[i].getName())) {
                    return i;
                }

            }
        }
        return -1;

    }

    @Override
    public void searchPhone(String name) {

    }

    @Override
    public void sort() {
        Arrays.sort(phoneList);
        display();
    }
}
