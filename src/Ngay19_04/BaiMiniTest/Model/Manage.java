package Ngay19_04.BaiMiniTest.Model;

public interface Manage<E> {
    void creat();
    void edit();
    E delete();
    E search();
    void  displayAll();

}
