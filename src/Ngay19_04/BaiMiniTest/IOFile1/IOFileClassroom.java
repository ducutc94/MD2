package Ngay19_04.BaiMiniTest.IOFile1;

import Ngay19_04.BaiMiniTest.Model.Classroom;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IOFileClassroom {
    static File file=new File("E:\\NNLT\\MD2\\MD2\\src\\Ngay19_04\\BaiMiniTest\\IOFile1\\IOFlileClassroom");
    public void writeFile(List<Classroom> classroomList) throws IOException {
        FileWriter fileWriter=new FileWriter(file);
        BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
        for (Classroom c:classroomList) {
            bufferedWriter.write(c.toString()+"\n");
        }
        bufferedWriter.close();
        fileWriter.close();
    }

    public List<Classroom> readFile() throws IOException {
        List<Classroom> classroomList=new ArrayList<>();
        FileReader fileReader=new FileReader(file);
        BufferedReader bufferedReader=new BufferedReader(fileReader);
        String c;
        String[] str;
        while ((c=bufferedReader.readLine())!=null){
            str=c.split(",");
            classroomList.add(new Classroom(str[1]));
        }
        return classroomList;
    }
}
