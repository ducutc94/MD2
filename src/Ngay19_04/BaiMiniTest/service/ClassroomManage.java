package Ngay19_04.BaiMiniTest.service;

import Ngay19_04.BaiMiniTest.Model.Classroom;

import java.util.ArrayList;
import java.util.List;
public class ClassroomManage {
    List<Classroom> classrooms=new ArrayList<>();

    public ClassroomManage() {
       classrooms.add(new Classroom("lớp 1"));
       classrooms.add(new Classroom("lớp 2"));
       classrooms.add(new Classroom("lớp 3"));
    }

    public void displayClass(){
        for (Classroom classroom : classrooms) {
            System.out.println(classroom);
        }
    }
    public void deleteById(int id){
        int deleteId=getClassById(id);
        if(deleteId!=-1){
            classrooms.remove(deleteId);
        }
    }
    public int getClassById(int id){
        for (int i = 0; i < classrooms.size(); i++) {
            if(classrooms.get(i).getId()==id){
                return i;
            }

        }
        return -1;
    }

}
