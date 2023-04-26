package Ngay19_04.BaiMiniTest.IOFile1;

import Ngay19_04.BaiMiniTest.Model.Classroom;
import Ngay19_04.BaiMiniTest.Model.Student;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFile {
   static File file=new File("E:\\NNLT\\MD2\\MD2\\src\\Ngay19_04\\BaiMiniTest\\IOFile");
    public  void writeFile(List<Student> studentList) throws IOException {
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (Student student:studentList) {
            bufferedWriter.write(student.toString()+"\n");

        }
        bufferedWriter.close();
        fileWriter.close();
    }
    public  List<Student> readFile() throws IOException {
        List<Student> studentList=new ArrayList<>();
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String c;
        String[] str;
        while ((c=bufferedReader.readLine())!=null){
            str=c.split(",");
            Student student=new Student(str[1],Integer.parseInt(str[2]),str[3],Double.parseDouble(str[4]),new Classroom(str[5]));
            studentList.add(student);
        }
        bufferedReader.close();
        fileReader.close();
        return studentList;
    }
}
