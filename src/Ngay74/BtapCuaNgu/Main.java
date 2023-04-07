package Ngay74.BtapCuaNgu;

public class Main {
    public static void main(String[] args) {
        FullTime nv1=new FullTime(1,"NV1",18,10);
        FullTime nv2=new FullTime(1,"NV2",18,3);
        FullTime nv3=new FullTime(1,"NV3",18,5);
        PartTime pv1=new PartTime(1,"PV1",15,2);
        PartTime pv2=new PartTime(1,"PV2",15,2);
        Employee[] employees={nv1,nv2,nv3,pv1,pv2};
        for (int i = 0; i < employees.length; i++) {
            if(employees[i] instanceof FullTime ){
                System.out.println(luonFullTime((FullTime)employees[i]));
            }else {
                System.out.println(luonPartTime((PartTime)employees[i]));
            }
        }
    }
    public static int luonFullTime(FullTime a){
        return a.getYearOfExp()*2000000;
    }
    public static int luonPartTime(PartTime b){
        return b.getWordTime()*25000;
    }
}
