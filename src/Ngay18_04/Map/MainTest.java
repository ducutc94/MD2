package Ngay18_04.Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MainTest {
    public static  void main(String[] args) {
        Students students=new Students("Nam",18,"HN");
        Students students1=new Students("Nữ",17,"HCM");
        Students students2=new Students("Bac",16,"HP");
        Students students3=new Students("Trung",20,"Đà Nẵng");
        Map<Integer,Students> studentsMap=new HashMap<Integer,Students>();
        studentsMap.put(1,students);
        studentsMap.put(2,students1);
        studentsMap.put(3,students2);
        studentsMap.put(4,students3);
        for(Map.Entry<Integer,Students> studentsEntry:studentsMap.entrySet()){
            System.out.println(studentsEntry.getKey()+" : "+studentsEntry.getValue());

        }
        Set<Students> student = new HashSet<Students>();
        student.add(students);
        student.add(students2);
        student.add(students3);
        student.add(students1);

        for(Students studentsa : student){
            System.out.println(studentsa.toString());
        }


    }
}
